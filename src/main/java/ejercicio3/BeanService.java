package ejercicio3;
//se precisa implementar esta interfaz, tanto en el bean, como en el decorador
public abstract interface BeanService {
	
	//solo está funcion va a ser decorada
	public void funcionADecorar();
	
	public void funcionSinDecorar();
}
