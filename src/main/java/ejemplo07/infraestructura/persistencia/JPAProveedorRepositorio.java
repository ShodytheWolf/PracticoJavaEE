package ejemplo07.infraestructura.persistencia;

import java.util.HashMap;

import ejemplo07.dominio.Proveedor;
import ejemplo07.dominio.ProveedorRepositorio;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class JPAProveedorRepositorio implements ProveedorRepositorio{

	private HashMap<Integer, Proveedor> listaProveedores;

	//esta anotación hace que el próximo método se ejecute tras la debida inyección de dependencias
	@PostConstruct
	void cargar() {
		listaProveedores = new HashMap<Integer, Proveedor>();
		
		System.out.println("Cargando proveedores. . .");
		listaProveedores.put(1, new Proveedor("Antúnez"));
		listaProveedores.put(2, new Proveedor("Antonio"));
		listaProveedores.put(3, new Proveedor("Antonela"));
	}
	
	
	@Override
	public HashMap<Integer, Proveedor> findAll() {
		//asumamos pues, que estoy levantando un MediaQuery con JPA y haciendo consultas a una BdD de forma remota
		return this.listaProveedores;
	}

	
	@Override
	public void agregar(Proveedor proveedorNuevo) {
		listaProveedores.put(proveedorNuevo.getValor(), proveedorNuevo);
	}

}
