package co.com.siggo.certification.testqa.stepsdefinitions;

import co.com.siggo.certification.testqa.questions.VerifyResult;
import co.com.siggo.certification.testqa.tasks.FilterNameUser;
import co.com.siggo.certification.testqa.tasks.FilterListUsers;
import co.com.siggo.certification.testqa.tasks.SearchList;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class reqresInAPIStepDefinitions {
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{string} obtiene una lista de usuarios del API reqresIn")
    public void obtieneUnaListaDeUsuariosDelAPIReqresIn(String strActor) {
        theActorCalled(strActor).wasAbleTo(SearchList.ofUsers());
    }

    @When("de la lista de resultados toma aquellos que contengan el ID menor a {string}")
    public void deLaListaDeResultadosTomaAquellosQueContenganElIDMenorA(String strId) {
        theActorInTheSpotlight().attemptsTo(FilterListUsers.withId(strId));
    }

    @When("por cada elemento de la lista anterior tomar solo aquel que el nombre inicie con {string}")
    public void porCadaElementoDeLaListaAnteriorTomarSoloAquelQueElNombreInicieCon(String strLetra) {
        theActorInTheSpotlight().attemptsTo(FilterNameUser.witFirstName(strLetra));
    }

    @Then("Sobre el empleado resultante, assert lo siguiente")
    public void sobreElEmpleadoResultanteAssertLoSiguiente(DataTable dataTable) {
        List<Map<String,String>> mapsResultUsers = dataTable.asMaps(String.class,String.class);
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyResult.ofUsers(mapsResultUsers)));
    }
}
