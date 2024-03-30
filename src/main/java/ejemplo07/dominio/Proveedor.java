package ejemplo07.dominio;

import java.util.Random;

public class Proveedor {
	private String titulo;
	private int valor;

	public Proveedor (String titulo) {
		super();
		this.titulo = titulo;
		
		Random ran = new Random();
		this.valor = ran.nextInt(1000);
	}
	
	@Override
	public String toString() {
		return "Proveedor [ titulo= " + this.titulo + " | N°: " + this.valor + " ]";
	}
	
	
	public int getValor() {
		return this.valor;
	}
}
