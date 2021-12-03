package co.com.siggo.certification.testqa.tasks;

import co.com.siggo.certification.testqa.interactions.ExplicitWaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;
import java.util.Map;

import static co.com.siggo.certification.testqa.userinterface.HomeFalabellaPage.*;

public class PressOnTheProduct implements Task {
    private List<Map<String,String>> lisResultProduct;

    public PressOnTheProduct(List<Map<String, String>> lisResultProduct) {
        this.lisResultProduct = lisResultProduct;
    }

    public static PressOnTheProduct toSeeTheDetail(List<Map<String, String>> mapsResultProduct) {
        return Tasks.instrumented(PressOnTheProduct.class,mapsResultProduct);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ExplicitWaitElement.untilIsPresent(LIST_PRODUCTS.of(lisResultProduct.get(0).get("nombreProducto"))),
                Click.on(LIST_PRODUCTS.of(lisResultProduct.get(0).get("nombreProducto"))),
                //Click.on(MODAL_CONTENTS_INFO_TARJETA_CRM),
                Click.on(BUTTON_ADD_BAG),
                Click.on(BUTTON_SEE_SHOPPING_BAG)
        );

    }
}
