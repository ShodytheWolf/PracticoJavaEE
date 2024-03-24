package ejemplo06;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;

@ApplicationScoped
public class PublicadorEvento {
	
	@Inject
	private Event<Evento> eventoConcreto;
	@Inject
	private Event<OtroEvento> otroEventoConcreto;
	
	public void publicarEvento(String descEvento) {
		
		//Disparo evento
		//Observar que el Notificador/Publicador no conoce (no está acoplado de ninguna manera)
		//a los escuchas)
		Evento e = new Evento(descEvento);
		eventoConcreto.fire(e);
		
		System.out.println("Notificando evento: " + descEvento);
	}
	
	
	public void publicarOtroEvento(String descripcion, int valor) {
		
		OtroEvento e = new OtroEvento(descripcion, valor);
		otroEventoConcreto.fire(e);
		
		System.out.println("Notificando OTRO evento: " + e.getDescripcion());
		//System.out.println("Otro Evento Desc:" + e.getDescripcion());
	}
}
