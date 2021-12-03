package co.com.siggo.certification.testqa.tasks;

import co.com.siggo.certification.testqa.interactions.ExplicitWaitElement;
import co.com.siggo.certification.testqa.interactions.ImplicityWaitToLoad;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


import java.util.List;
import java.util.Map;


import static co.com.siggo.certification.testqa.userinterface.HomeGooglePage.*;



public class SelectItem implements Task {
    private List<Map<String,String>> mapsResultEcommerce;

    public SelectItem(List<Map<String, String>> mapsResultEcommerce) {
        this.mapsResultEcommerce = mapsResultEcommerce;
    }

    public static SelectItem inTheList(List<Map<String,String>> mapsResultEcommerce) {
        return Tasks.instrumented(SelectItem.class,mapsResultEcommerce);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                ImplicityWaitToLoad.theSeconds(30),
                ExplicitWaitElement.untilIsPresent(LIST_FILTERS.of(mapsResultEcommerce.get(0).get("ecommerce"))),
                ExplicitWaitElement.untilAppears(LIST_FILTERS.of(mapsResultEcommerce.get(0).get("ecommerce"))),
                Click.on(LIST_FILTERS.of(mapsResultEcommerce.get(0).get("ecommerce"))),
                ExplicitWaitElement.untilIsPresent(RESULT_SEARCH.of(mapsResultEcommerce.get(0).get("resultadoConsulta"))),
                ExplicitWaitElement.untilAppears(RESULT_SEARCH.of(mapsResultEcommerce.get(0).get("resultadoConsulta"))),
                Click.on(RESULT_SEARCH.of(mapsResultEcommerce.get(0).get("resultadoConsulta")))
        );
    }
}
