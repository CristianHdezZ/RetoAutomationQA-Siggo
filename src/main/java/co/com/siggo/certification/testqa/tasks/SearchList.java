package co.com.siggo.certification.testqa.tasks;


import co.com.siggo.certification.testqa.interactions.SearchListOfUsers;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SearchList implements Task {

    public static SearchList ofUsers() {
        return Tasks.instrumented(SearchList.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                SearchListOfUsers.inTheAPI()
        );

    }
}
