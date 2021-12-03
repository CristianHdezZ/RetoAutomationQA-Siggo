package co.com.siggo.certification.testqa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeFalabellaPage {

    public static final Target BUTTON_CLOSE_ALERT_SIN_IVA = Target
            .the("Button close Alert dia sin iva")
            .locatedBy("(//div[@class='dy-lb-close'])[1]");


    public static final Target BUTTON_NO_THANKS = Target
            .the("Popup")
            .located(By.id("acc-alert-deny"));

    public static final Target INPUT_SEARCH_PRODUCT = Target
            .the("Search product")
            .located(By.id("testId-SearchBar-Input"));


    public static final Target LIST_PRODUCTS = Target
            .the("List products")
            .locatedBy("//span//b[contains(text(),'{0}')]");

    public static final Target MODAL_CONTENTS_INFO_TARJETA_CRM = Target.the("Modal de informacion de tarjeta CRM")
            .located(By.xpath("//div[@class='dy-lb-close']"));

    public static final Target BUTTON_ADD_BAG = Target
            .the("Add bag")
            .located(By.id("buttonForCustomers"));

    public static final Target BUTTON_SEE_SHOPPING_BAG = Target
            .the("Add bag")
            .located(By.id("linkButton"));

    public static final Target BUTTON_INCREASE = Target
            .the("Label Quantity")
            .located(By.xpath("//button[@class='increase']"));

    public static final Target SELECT_LIST_WARRANTY = Target
            .the("")
            .located(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/section/section/div/div/div/form/div"));

    public static final Target SELECT_WARRANTY = Target
            .the("Warranty")
            .located(By.xpath("//span[@class=\"fb-inline-dropdown__link__title js-inline-dropdown__link__title\"]"));

    public static final Target SELECT_OPTION_WARRANTY = Target
            .the("Option Warranty")
            .located(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/section/section/div/div/div/form/div/div/ul/li[2]/a"));

    public static final Target LABEL_NOMBRE_PRODUCTO = Target
            .the("Etiqueda del nombre del producto")
            .locatedBy("//*[@class='fbra_text fbra_test_orderSummary__itemProperty fbra_orderSummary__itemProperty__name']");

    public static final Target LABEL_PRECIO_PRODUCTO = Target
            .the("Etiqueta del precio del producto")
            .locatedBy("//span[@class=\"fbra_text fbra_test_orderSummary__itemPrice fbra_orderSummary__itemPrice\"]");

    public static final Target LABEL_SEGURO_PRODUCTO = Target
            .the("Seguro")
            .locatedBy("//*[@class='fb-inline-dropdown__link__title js-inline-dropdown__link__title']");

    public static final Target BUTTON_IR_COMPRAR = Target
            .the("")
            .located(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/form/div[2]/div[2]/div[2]/button"));







}
