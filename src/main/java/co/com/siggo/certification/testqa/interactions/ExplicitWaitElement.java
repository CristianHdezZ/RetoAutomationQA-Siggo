package co.com.siggo.certification.testqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitElement implements Interaction {
    private Target target;
    private String strState;

    public ExplicitWaitElement(Target target, String strState) {
        this.target = target;
        this.strState = strState;
    }

    @Override
    @Step("{0} waits the #target until be #state")
    public <T extends Actor> void performAs(T actor) {
        switch (strState){
            case "Visible":
                while (!target.resolveFor(actor).isVisible()){
                    waitAs(actor).until(ExpectedConditions.visibilityOf(target.resolveFor(actor)));
                }
                break;
            case "Invisible":
                waitAs(actor).until(ExpectedConditions.visibilityOf(target.resolveFor(actor)));
                break;
            case "Enabled":
                while (!target.resolveFor(actor).isEnabled()){
                    waitAs(actor).until(ExpectedConditions.elementToBeClickable(target.resolveFor(actor)));
                }
                break;
            case "Present":
                while (!target.resolveFor(actor).isPresent()){
                    waitAs(actor).until(ExpectedConditions.elementToBeClickable(target.resolveFor(actor)));
                }
                break;
        }
    }

    private WebDriverWait waitAs(Actor actor){return new WebDriverWait(BrowseTheWeb.as(actor).getDriver(),1000);}
    public static ExplicitWaitElement untilAppears(Target target){
        return Tasks.instrumented(ExplicitWaitElement.class,target,"Visible");
    }
    public static ExplicitWaitElement untilDisappears(Target target){
        return Tasks.instrumented(ExplicitWaitElement.class,target,"Invisible");
    }
    public static ExplicitWaitElement untilBeEnabled(Target target){
        return Tasks.instrumented(ExplicitWaitElement.class,target,"Enabled");
    }
    public static ExplicitWaitElement untilIsPresent(Target target){
        return Tasks.instrumented(ExplicitWaitElement.class,target,"Present");
    }

}
