package co.com.siggo.certification.testqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;

public class IncreaseQuantity implements Interaction {
    private String strCantidad;
    private WebElement labelCantidad;
    private Target buttonAmount;

    public IncreaseQuantity(String strCantidad, WebElement labelCantidad, Target buttonAmount) {
        this.strCantidad = strCantidad;
        this.labelCantidad = labelCantidad;
        this.buttonAmount = buttonAmount;
    }

    public static IncreaseQuantity amount(String strCantidad, WebElement targetLabel,Target buttonAmount){
        return Tasks.instrumented(IncreaseQuantity.class,strCantidad,targetLabel,buttonAmount);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //String strLabelCantidad = Text.of(labelCantidad).answeredBy(actor);
        String strLabelCantidad = labelCantidad.getAttribute("Value");
        System.out.println("Cantidad: "+strLabelCantidad+"  ="+strCantidad);
        for (int i=1;i<=Integer.parseInt(strCantidad);i++){
            if (Integer.parseInt(strLabelCantidad)!=i){
                actor.attemptsTo(
                        Click.on(buttonAmount)
                );
            }

        }
    }
}
