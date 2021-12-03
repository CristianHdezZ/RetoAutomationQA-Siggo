@CompraProductoSaucedemo
Feature: Comprar prodcuto en saucedemo.com
  Yo como usurio de saucedemo.com
  ingreso a saucedemo.com
  a comprar un producto

  Background:
    Given el "usurio" ingresa a al sitio

  @Login_credeciales_validas
   Scenario Outline: Login con credenciales validas
    When se autentica con sus credenciales
      |user|password|
      |<user>|<password>|
    Then verifica que el nombre en su perfil
      |user|
      |<user>|
    Examples:
      |user|password|
      |standard_user|secret_sauce|

  @Login_user_invalido
  Scenario Outline: Login con nombre de usuario invalido
    When se autentica con sus credenciales
      |user|password|
      |<user>|<password>|
    Then verifica que retorne el mensaje "Epic sadface: Username and password do not match any user in this service"
    Examples:
      |user|password|
      |standard_user|secret_sauce33|

  @Login_password_invalido
  Scenario Outline: Login con password invalido
    When se autentica con sus credenciales
      |user|password|
      |<user>|<password>|
    Then verifica que retorne el mensaje "Epic sadface: Username and password do not match any user in this service"
    Examples:
      |user|password|
      |standard_user|secret_sauce33|

  @Compra_exitosa
  Scenario Outline: Compra Exitosa
    When se autentica con sus credenciales
      |user|password|
      |<user>|<password>|
    And realiza una compra de un prodcuto
      |producto|firstname|lastname|postalcode|
      |<producto>|<firstname>|<lastname>|<postalcode>|
    Then verica que la compra se realice "THANK YOU FOR YOUR ORDER"
    Examples:
      |user|password|producto|firstname|lastname|postalcode|
      |standard_user|secret_sauce|Sauce Labs Backpack|Cristian|Hernandez|055450|

  @CompraFallida
  Scenario Outline: Compra Fallida
    Given el "usurio" ingresa a al sitio
    When ingresa sus credenciales
      |user|password|
      |<user>|<password>|
    And realiza una compra de un prodcuto
      |producto|firstname|lastname|postalcode|
      |<producto>|<firstname>|<lastname>|<postalcode>|
    Then verica que la compra se realice "Failed"
    Examples:
      |user|password|producto|firstname|lastname|postalcode|
      |standard_user|secret_sauce|Sauce Labs Backpack|Cristian|Hernandez|055450|
