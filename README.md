Ejemplo de despliegue continuo
==============================
Ejemplo de proyecto para utilizar herramientas estandar del mundo java
como maven, junit, selenium y jenkins para poder realizar un ciclo de vida basado en **desarrollo continuo**

Esto se explica y se desarrolla en la siguiente [entrada] (http://www.logicaalternativa.com/?p=489 de 
**[LogicaAlternativa.com] (http://www.logicaalternativa.com)**

Clases
------
El un proyecto maven muy sencillo basado en JSF. Un 'Hola Mundo' con las siguientes clases:

- **HolaMundo.java** (src/main/java/com/logicaalternativa/ejemplos/desplieguecontinuo/HolaMundo.java) que es el controlador de Java Server Faces
- **HolaMundoTest.java** (src/test/java/com/logicaalternativa/ejemplos/desplieguecontinuo/HolaMundoTest.java) el test de Junit
- **HolaMundoTestIT.java** (src/test/java/com/logicaalternativa/ejemplos/desplieguecontinuo/HolaMundoTestIT.java). La prueba de integración de Selenium

pom.xml
-------
En el archivo pom.xml se definen los diferentes plugins que se han usado para poder realizar el despliegue continuo.

M.E.

**[LogicaAlternativa.com] (http://www.logicaalternativa.com)**
