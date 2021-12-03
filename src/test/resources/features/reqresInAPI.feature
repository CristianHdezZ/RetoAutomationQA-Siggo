Feature: Consulta de usuarios
  Como Usuario
  Quiero ingresar al API reqres.in
  A consulta informacion de todos los usuarios

  @ConsultaExitosaUsuarios
  Scenario Outline: Consulta de usuarios
    Given "Cristian" obtiene una lista de usuarios del API reqresIn
    When de la lista de resultados toma aquellos que contengan el ID menor a "9"
    And por cada elemento de la lista anterior tomar solo aquel que el nombre inicie con "M"
    Then Sobre el empleado resultante, assert lo siguiente
      |id|firstName|lastName|email|
      |<id>|<firstName>|<lastName>|<email>|
    Examples:
      |id|firstName|lastName|email|
      |7|Michael|Lawson|michael.lawson@reqres.in|