package co.com.siggo.certification.testqa.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/compraFalabella.feature",
        glue = "co.com.siggo.certification.testqa.stepsdefinitions",
        tags = "@CompraExitosa",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class compraFalabellaRunner {
}
