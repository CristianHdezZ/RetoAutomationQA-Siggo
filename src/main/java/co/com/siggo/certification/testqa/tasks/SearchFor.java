package co.com.siggo.certification.testqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.siggo.certification.testqa.userinterface.HomeGooglePage.*;

public class SearchFor implements Task {
    private String strKeyWord;

    public SearchFor(String strKeyWord) {
        this.strKeyWord = strKeyWord;
    }

    public static SearchFor theKeyWord(String strKeyWord) {
        return Tasks.instrumented(SearchFor.class,strKeyWord);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues(strKeyWord).into(INPUT_SEARCH)
        );
    }
}
