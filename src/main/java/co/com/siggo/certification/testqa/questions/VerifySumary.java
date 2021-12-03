package co.com.siggo.certification.testqa.questions;

import co.com.siggo.certification.testqa.model.Product;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.siggo.certification.testqa.userinterface.HomeFalabellaPage.*;


public class VerifySumary implements Question<Boolean> {
    private Product product;

    public VerifySumary(Product product) {
        this.product = product;
    }

    public static VerifySumary ofOrder(Product product) {
        return new VerifySumary(product);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String strLabelNombreProducto = Text.of(LABEL_NOMBRE_PRODUCTO).answeredBy(actor);
        String strLabelPrecioProducto = Text.of(LABEL_PRECIO_PRODUCTO).answeredBy(actor);


        System.out.println(strLabelNombreProducto+" "+strLabelPrecioProducto);
        System.out.println(product.getNombreProducto()+"  "+product.getPrecio());

        return strLabelNombreProducto.contains(product.getNombreProducto())&&product.getPrecio().equalsIgnoreCase(strLabelPrecioProducto);

    }
}