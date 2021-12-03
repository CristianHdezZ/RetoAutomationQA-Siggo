package co.com.siggo.certification.testqa.tasks;

import co.com.siggo.certification.testqa.interactions.FilterListUsersItera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class FilterListUsers implements Task {
    private String strId;

    public FilterListUsers(String strId) {
        this.strId = strId;
    }

    public static FilterListUsers withId(String strId) {
        return Tasks.instrumented(FilterListUsers.class,strId);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                FilterListUsersItera.withId(strId)
        );
    }
}
