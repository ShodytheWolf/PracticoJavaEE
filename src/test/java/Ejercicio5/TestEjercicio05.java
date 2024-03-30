package Ejercicio5;

import java.util.HashMap;
import java.util.Map;

import org.jboss.weld.junit5.auto.AddPackages;
import org.jboss.weld.junit5.auto.EnableAutoWeld;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ejemplo07.dominio.Proveedor;
import ejemplo07.aplicacion.ProveedorService;
import ejemplo07.aplicacion.impl.ProveedorServiceImpl;
import ejemplo07.infraestructura.persistencia.JPAProveedorRepositorio;
import jakarta.inject.Inject;

@EnableAutoWeld
@AddPackages(ProveedorServiceImpl.class)
@AddPackages(JPAProveedorRepositorio.class)

class TestEjercicio05 {

	@Inject
	private ProveedorService proveedorService;
	
	@Test
	void Test() {
		
		HashMap<Integer, Proveedor> proveedores = proveedorService.obtenerProvedores();
		
		//itero a través de las entradas del HashMap
		for(Map.Entry<Integer, Proveedor> set : proveedores.entrySet()) {
			//printeo mis valores
			System.out.println(set.getValue().toString());
		}
		
		proveedorService.agregarProveedor("Joselito de los Angeles");
		
		
		for(Map.Entry<Integer, Proveedor> set : proveedores.entrySet()) {
			//printeo mis valores
			System.out.println(set.getValue().toString());
		}
		
	}
}
