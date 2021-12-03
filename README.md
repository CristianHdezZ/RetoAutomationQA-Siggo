# RetoAutomationQA-Siggo
#**Test Automation - Screenplay Pattern - Web**

## Pre-requisitos
1. Java 8
2. Gradle 5.2.1 o Superior
3. IDE de desarrollo
	- a) Eclipse 
	- b) IntelliJ

## Descripción

Este proyecto es un reto de automatización de API REST y aplicación Web, se encuentra creado bajo el patrón de diseño Screenplay e integra varios frameworks como Serenity y Cucumber dentro del manejador de proyecto Gradle.

Los tests usan tareas (tasks), interacciones (interactions), preguntas (questions), elementos de páginas (userinterface). La estructura completa del proyecto es la siguiente:
```
    + ## exceptions
        Clases que controlan las posibles excepciones técnicas y de negocios que se presentan durante la ejecución de pruebas
    + ## model
        Clases relacionadas con el modelo de dominio y sus respectivos builder cuando es necesario
    + ## tasks
        Clases que representan tareas que realiza el actor a nivel de proceso de negocio
    + ## interactions
        Clases que representan las interacciones directas con la interfaz de usuario
    + ## userinterface
        Page Objects y Page Elements. Mapean los objetos de la interfaz de usuario o aplicacion Web
    + ## questions
        Objetos usados para consultar acerca del estado de la aplicación o verificar el resultado esperado de la ejecución de prueba.
    + ## util
        Clases de utilidad
    + ## runners
        Clases que permiten correr los tests
    + ## step definitions
        Clases que mapean las líneas Gherkin a código java y donde se llaman todas las tareas(tasks) y preguntas(questions) creadas para la ejecución de 
la prueba
    + ## features
        La representación de las historias de usuarios en archivos cucumber o .feature
```


  
Este proyecto cuenta con la ejecución de dos test: 
  
  - **reqresInAPI.feature**: En este feature se realiza la ejecución de un escenario para probar el EndPoint: 
  	
  	GET-->https://reqres.in/api/users?page=2
	
        
	



  ##Escenario:
   
    Se definen los siguientes criterios para el flujo de la ejecución y tener un alcance y cubrimiento en gran medida de las pruebas automatizadas:    
    
    1.	Obtener un listado de todos los Usuarios. Para ello, se debe ejecutar el siguiente servicio: https://reqres.in/api/users?page=2

    2.	De la lista de resultados del punto 1, tomar aquellos que contengan el ID menor a "9"

    3.	Por cada elemento de la lista anterior tomar solo aquel que el nombre inicie con la letra "M"  

    4.	Assert:  Sobre el usuario resultante, assert lo siguiente:
     "id": 7,
     "firstName": "Michael",
     "lastName": "Lawson",
     "email": "michael.lawson@reqres.in",
  
    


- **compraFalabella.feature**: En este feature se realiza la ejecución de un escenario de agregar un prodcuto en un carro de compra, mapeado en la aplicación    **https://www.falabella.com.co/falabella-co** a través del una data de prueba. 

---
  
---
## Instalación

Para instalar el proyecto deben seguir los siguientes pasos:
  
**1. Clonar el proyecto**

```
git clone https://github.com/CristianHdezZ/RetoAutomationQA-Siggo.git
```

**2. Importar el proyecto**
  
Para importar el proyecto debe hacerlo desde el IDE de su preferencia seleccionando la carpeta **"RetoAutomationQA-Siggo"** como un proyecto Gradle. 
  
  
**3. Ejecutar el proyecto** 

Para ejecutar el proyecto debe hacerlo a través de uno de los siguientes pasos: 
  
**3.1 A través de línea de comando**
  
Si se desea realizar a través de la línea de comando se debe ejecutar desde una consola de comandos (de su preferencia) con el comando: 

```
gradle clean test aggregate --info
```
  
**3.2 A través de IDE** 
  
Si se desea realizar la ejecución a través del IDE de desarrollo, se debe seleccionar la clase **"compraFalabellaRunner.class o reqresInAPIRunner.class"** y dar clic derecho, seleccionar la opción que permita correr la prueba. 
  
---
  
---
## ️Autores
* **Cristian Hernandez Z.** - **TCS** - [CristianHdezZ](https://github.com/CristianHdezZ/)
---

