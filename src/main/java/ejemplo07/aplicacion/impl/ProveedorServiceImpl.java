package ejemplo07.aplicacion.impl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.HashMap;

import ejemplo07.aplicacion.ProveedorService;
import ejemplo07.dominio.Proveedor;
import ejemplo07.dominio.ProveedorRepositorio;

@ApplicationScoped
public class ProveedorServiceImpl implements ProveedorService {

	//Inyecto mi repositorio, de la capa de infraestructura
	
	@Inject
	private ProveedorRepositorio proveedorRepositorio;
	
	@Override
	public void agregarProveedor(String titulo) {
		
		Proveedor proveedorNuevo = new Proveedor(titulo);
		proveedorRepositorio.agregar(proveedorNuevo);
		System.out.println("Se añadió al proveedor: " + proveedorNuevo.toString());
	}

	@Override
	public void borrarProveedor(String titulo) {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public HashMap<Integer, Proveedor> obtenerProvedores() {
		return proveedorRepositorio.findAll();
	}

}
