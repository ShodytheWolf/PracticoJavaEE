package ejercicio3;

import jakarta.annotation.Priority;
import jakarta.decorator.Decorator;
import jakarta.decorator.Delegate;
import jakarta.inject.Inject;

//Indico que esta clase es un decorador, también puedo avisarlo a traves de beans.xml, el cual toma prioridad por encima de este.
@Decorator

//Indico lo propiedad de Decorador, en caso de que hayan otros Decoradores
@Priority(1)
public abstract class Decorador implements BeanService {
	
	//Inyecto la interfaz a la cual voy a implementar
	@Inject
	
	//Indico que objeto es el que será decorado
	@Delegate
	BeanService beanService;
	
	@Override
	public void funcionADecorar() { //decoro
		beanService.funcionADecorar();
		System.out.println("Estoy decorando una función!");
	}
}
