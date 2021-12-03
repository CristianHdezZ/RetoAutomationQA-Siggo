package co.com.siggo.certification.testqa.stepsdefinitions;

import co.com.siggo.certification.testqa.model.Product;
import co.com.siggo.certification.testqa.questions.VerifySumary;
import co.com.siggo.certification.testqa.tasks.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class compraFalabellaStepDefinitions {
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{string} ingresa a {string}")
    public void cristianIngresaA(String strActor,String strUrl) {
        theActorCalled(strActor).wasAbleTo(Open.url(strUrl));
    }
    @Given("consulta la palabra {string}")
    public void consultaLaPalabra(String strKeyWord) {
        theActorInTheSpotlight().attemptsTo(SearchFor.theKeyWord(strKeyWord));
    }
    @Given("del listado presionar en el primer item que aparezca para entrar al ecommerce")
    public void delListadoPresionarEnElPrimerItemQueAparezcaParaEntrarAlEcommerce(DataTable dataTableEcommerce) {
        List<Map<String,String>> mapsResultEcommerce = dataTableEcommerce.asMaps(String.class,String.class);
        theActorInTheSpotlight().attemptsTo(SelectItem.inTheList(mapsResultEcommerce));
    }
    @When("dentro de la tienda, buscar el producto {string}")
    public void dentroDeLaTiendaBuscarElProducto(String strArticle) {
        theActorInTheSpotlight().attemptsTo(SearchProduct.withName(strArticle));
    }
    @When("presionar en el producto para ver la nueva página con el detalle y agregarlo a bolsa de productos")
    public void presionarEnElProductoParaVerLaNuevaPáginaConElDetalleYAgregarloABolsaDeProductos(DataTable dataTableProduct) {
        List<Map<String,String>> mapsResultProduct = dataTableProduct.asMaps(String.class,String.class);
        theActorInTheSpotlight().attemptsTo(PressOnTheProduct.toSeeTheDetail(mapsResultProduct));
    }
    @When("en la bolsa de compras aumentar a")
    public void
    enLaBolsaDeComprasAumentarA(DataTable dataTableAmount) {
        List<Map<String,String>> mapsResultAmount = dataTableAmount.asMaps(String.class,String.class);
        theActorInTheSpotlight().attemptsTo(IncreaseBuy.withTheAmount(mapsResultAmount));

    }
    @When("agregar garantia extendida y luego presionar el boton Ir a Comprar")
    public void agregarGarantiaExtendidaYLuegoPresionarElBotonIrAComprar(DataTable dataTableWarranty) {
        List<Map<String,String>> mapsResultWarranty = dataTableWarranty.asMaps(String.class,String.class);
        theActorInTheSpotlight().attemptsTo(SelectWarranty.ofProdcut(mapsResultWarranty));

    }

    @DataTableType
    public Product productDataEntry(Map<String,String> entry){return Product.productDataEntry(entry);}
    @Then("Validar el producto, el valor en la página de despacho")
    public void validarElProductoElValorEnLaPáginaDeDespacho(List<Product> products) {

        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifySumary.ofOrder(products.get(0))));


    }
}
