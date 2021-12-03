package co.com.siggo.certification.testqa.tasks;


import co.com.siggo.certification.testqa.interactions.IncreaseQuantity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

import static co.com.siggo.certification.testqa.userinterface.HomeFalabellaPage.*;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class IncreaseBuy implements Task {
    private List<Map<String,String>> lisResultAmount;

    public IncreaseBuy(List<Map<String, String>> lisResultAmount) {
        this.lisResultAmount = lisResultAmount;
    }

    public static IncreaseBuy withTheAmount(List<Map<String, String>> mapsResultAmount) {
        return Tasks.instrumented(IncreaseBuy.class,mapsResultAmount);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //String strCantidadProducto = getDriver().findElement(By.id("quantityInput")).getAttribute("Value");
        //System.out.println("Valor: "+strCantidadProducto);
        WebElement LABEL_QUANTITY = getDriver().findElement(By.id("quantityInput"));
        actor.attemptsTo(
                //IncreaseQuantity.amount(lisResultAmount.get(0).get("cantidad"),LABEL_QUANTITY,BUTTON_INCREASE)
        );
    }
}
