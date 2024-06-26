package ejercicio3;

import org.jboss.weld.junit5.auto.AddPackages;
import org.jboss.weld.junit5.auto.EnableAutoWeld;
import org.junit.jupiter.api.Test;

import jakarta.inject.Inject;

@EnableAutoWeld
@AddPackages(ejercicio3.BeanService.class)
public class TestEjercicio3 {
	
	//Interfaz que vamos a decorar, el decorador debe implementarla también para poder sobreescribir la función a decorar
	@Inject
	BeanService beanService;
	
	
	@Test
	public void Test() {
		beanService.funcionADecorar();
	}
	
}
