package co.com.siggo.certification.testqa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeGooglePage {

    public static final Target INPUT_SEARCH = Target
            .the("Search")
            .located(By.xpath("//input[@title='Buscar']"));

    public static final Target LIST_FILTERS = Target
            .the("List")
            .locatedBy("//div[@role='presentation']//li[@role='presentation']//div[@role='option']//div//span[.='{0}']");

    public static final Target RESULT_SEARCH = Target
            .the("Result consult")
            .locatedBy("//h3[.='{0}']");


}
