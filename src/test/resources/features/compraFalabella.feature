Feature: Comprar articulo con garantia extendida
  Como Usuario
  quiero ingresar a google
  y consultar Falabella e ingresar a la homepage
  realizar el proceso de compra de articulo
  con garantia extendida

  @CompraExitosa
  Scenario Outline: Compra exitosa de articulo con garantia extendida
    Given "Cristian" ingresa a "https://www.google.com/"
    And consulta la palabra "Falabella"
    And del listado presionar en el primer item que aparezca para entrar al ecommerce
      |ecommerce|resultadoConsulta|
      |<ecommerce>|<resultadoConsulta>|
    When dentro de la tienda, buscar el producto "PS4"
    And presionar en el producto para ver la nueva página con el detalle y agregarlo a bolsa de productos
      |nombreProducto|
      |<nombreProducto>|
    And en la bolsa de compras aumentar a
      |cantidad|
      |<cantidad>|
    And agregar garantia extendida y luego presionar el boton Ir a Comprar
      |garantia|
      |<garantia>|
    Then Validar el producto, el valor en la página de despacho
      |nombreProducto|cantidad|marca|categoria|precio|garantia|valorGarantia|
      |<nombreProducto>|<cantidad>|<marca>|<categoria>|<precio>|<garantia>|<valorGarantia>|
    Examples:
      |nombreProducto|cantidad|marca|categoria|precio|garantia|valorGarantia|ecommerce|resultadoConsulta|
      |Consola PS4 Mega18|2|PlayStation|Tecnología-Gaming|$1.799.900|1 año de Garantía Extendida $ 195.490|$ 195.490|Falabella|Falabella Colombia: Último Día sin IVA 2021|