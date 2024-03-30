Los mensajes que aparecen al ejecutar los tests unitarios, son los contenedores
de AutoWeld que se levantan y configuran para poder ejecutar e inyectar las dependencias de nuestro código.

"org.jboss.weld.bootstrap.WeldStartup startContainer"
Es la implementación para Jboss de AutoWeld inicializando el contenedor

mientras que "org.jboss.weld.environment.se.WeldContainer shutdown"
Es la implementación de AutoWeld que viene con Jboss (en nuestro caso WildFly) que está dando de baja el contenedor donde se ejecutó el test unitario.


Fuentes:
https://docs.jboss.org/weld/reference/latest/en-US/html_single/
https://www.cdi-spec.org/
https://github.com/weld/core/blob/master/impl/src/main/java/org/jboss/weld/bootstrap/WeldStartup.java
