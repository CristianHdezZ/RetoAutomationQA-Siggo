package co.com.siggo.certification.testqa.model;

import java.util.Map;

public class Product {
    private String nombreProducto,cantidad,marca,categoria,precio,garantia,valorGarantia;

    public Product(String nombreProducto, String cantidad, String marca, String categoria, String precio, String garantia, String valorGarantia) {
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.marca = marca;
        this.categoria = categoria;
        this.precio = precio;
        this.garantia = garantia;
        this.valorGarantia = valorGarantia;
    }

    public static Product productDataEntry(Map<String,String> entry){
        return new Product(
                entry.get("nombreProducto"),
                entry.get("cantidad"),
                entry.get("marca"),
                entry.get("categoria"),
                entry.get("precio"),
                entry.get("garantia"),
                entry.get("valorGarantia")
        );
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public String getValorGarantia() {
        return valorGarantia;
    }

    public void setValorGarantia(String valorGarantia) {
        this.valorGarantia = valorGarantia;
    }
}
