package ejercicio3;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BeanASerDecorado implements BeanService {
	//constructor vacio necesario para los beans
	public BeanASerDecorado() {
		super();
	}
	
	//función que será sobreescrita más adelante por un decorador
	@Override
	public void funcionADecorar() {
		System.out.println("Esta es la función que va a ser decorada!");
		return;
	}

	@Override
	public void funcionSinDecorar() {
		// TODO Auto-generated method stub
		
	}
}
