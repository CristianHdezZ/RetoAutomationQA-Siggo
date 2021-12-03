package co.com.siggo.certification.testqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import java.util.concurrent.TimeUnit;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class ImplicityWaitToLoad implements Interaction {
    private int intSeconds;

    public ImplicityWaitToLoad(int intSeconds) {
        this.intSeconds = intSeconds;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        getDriver().manage().timeouts().implicitlyWait(intSeconds, TimeUnit.SECONDS);
    }

    public static ImplicityWaitToLoad theSeconds(int intSeconds){
        return Tasks.instrumented(ImplicityWaitToLoad.class,intSeconds);
    }
}
