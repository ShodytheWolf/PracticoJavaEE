package ejemplo07.dominio;

import java.util.HashMap;

public interface ProveedorRepositorio {
	/*
	 * @param ninguno jaja
	 * @return un HashMap con todos los proveedores de la hipotetica BdD 
	 */
	HashMap<Integer, Proveedor> findAll();
	
	/*
	 * @param proveedor a ser agregado
	 * @returns nada
	 */
	void agregar(Proveedor proveedorNuevo);
	
}
