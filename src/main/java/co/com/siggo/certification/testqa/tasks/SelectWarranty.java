package co.com.siggo.certification.testqa.tasks;

import co.com.siggo.certification.testqa.interactions.ExplicitWaitElement;
import co.com.siggo.certification.testqa.interactions.ImplicityWaitToLoad;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import java.util.List;
import java.util.Map;

import static co.com.siggo.certification.testqa.userinterface.HomeFalabellaPage.*;


public class SelectWarranty implements Task {
    private List<Map<String,String>> mapsResultWarranty;

    public SelectWarranty(List<Map<String, String>> mapsResultWarranty) {
        this.mapsResultWarranty = mapsResultWarranty;
    }

    public static SelectWarranty ofProdcut(List<Map<String, String>> mapsResultWarranty) {
        return Tasks.instrumented(SelectWarranty.class,mapsResultWarranty);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        System.out.println("Valor: "+mapsResultWarranty.get(0).get("garantia"));

        actor.attemptsTo(
                ExplicitWaitElement.untilBeEnabled(SELECT_LIST_WARRANTY),
                ExplicitWaitElement.untilAppears(SELECT_LIST_WARRANTY),
                Scroll.to(SELECT_WARRANTY),
                Click.on(SELECT_LIST_WARRANTY),
                ImplicityWaitToLoad.theSeconds(300),
                ExplicitWaitElement.untilIsPresent(SELECT_OPTION_WARRANTY),
                Click.on(SELECT_OPTION_WARRANTY),
                Click.on(BUTTON_IR_COMPRAR)

        );
    }
}
