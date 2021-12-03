package co.com.siggo.certification.testqa.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/reqresInAPI.feature",
        glue = "co.com.siggo.certification.testqa.stepsdefinitions",
        tags = "@ConsultaExitosaUsuarios",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class reqresInAPIRunner {
}
