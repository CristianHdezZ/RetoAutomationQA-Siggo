package co.com.siggo.certification.testqa.tasks;

import co.com.siggo.certification.testqa.interactions.ExplicitWaitElement;
import co.com.siggo.certification.testqa.interactions.ImplicityWaitToLoad;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.siggo.certification.testqa.userinterface.HomeFalabellaPage.*;

public class SearchProduct implements Task {
    private String strArticle;

    public SearchProduct(String strArticle) {
        this.strArticle = strArticle;
    }

    public static SearchProduct withName(String strArticle) {
        return Tasks.instrumented(SearchProduct.class,strArticle);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //((JavascriptExecutor)getDriver()).executeScript("document.querySelector(\"a[href='https://www.falabella.com.co/falabella-co/page/dia-sin-iva?staticPageId=23000001&sid=dia_sin_iva3']\").click();");
        actor.attemptsTo(
                //ExplicitWaitElement.untilIsPresent(BUTTON_CLOSE_ALERT_SIN_IVA),
                //Click.on(BUTTON_CLOSE_ALERT_SIN_IVA),
                Click.on(BUTTON_NO_THANKS),
                Enter.keyValues(strArticle).into(INPUT_SEARCH_PRODUCT).thenHit(Keys.ENTER)
        );

    }
}
