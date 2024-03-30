package Ejercicio1y2;

import org.jboss.weld.junit5.auto.AddPackages;
import org.jboss.weld.junit5.auto.EnableAutoWeld;
import org.junit.jupiter.api.Test;

import ejemplo06.Evento;
import ejemplo06.PublicadorEvento;
import jakarta.inject.Inject;

@EnableAutoWeld
@AddPackages(Evento.class)
@AddPackages(PublicadorEvento.class)
class TestEjercicio1y2 {
	@Inject
	private PublicadorEvento pulicadorEvento;
	
	@Test
	void test() {
		//Eventos normales - Ejercicio 1
		pulicadorEvento.publicarEvento("Algo nuevo ha sucedido");
		pulicadorEvento.publicarEvento("Algo nuevo volvio a suceder!");
		
		//Otros eventos - Ejercicio 2
		pulicadorEvento.publicarOtroEvento("Este es un evento diferente", 4);
	}
}


