package ejemplo06;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;

@ApplicationScoped
public class ObservadorOtroEvento {

	public void accept(@Observes OtroEvento OtroEvento) {
        System.out.println("Soy OTRO observador: He recibido un OTRO evento: " + OtroEvento.getDescripcion() + " con valor: " + OtroEvento.getValor());;
	}
}
