package co.com.siggo.certification.testqa.tasks;

import co.com.siggo.certification.testqa.interactions.FilterNameUserInter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class FilterNameUser implements Task {
    private String strWord;

    public FilterNameUser(String strWord) {
        this.strWord = strWord;
    }

    public static FilterNameUser witFirstName(String strLetra) {
        return Tasks.instrumented(FilterNameUser.class,strLetra);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                FilterNameUserInter.withFirstWord(strWord)
        );
    }
}
