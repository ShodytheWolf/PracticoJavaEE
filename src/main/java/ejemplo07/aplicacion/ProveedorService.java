package ejemplo07.aplicacion;

import java.util.HashMap;

import ejemplo07.dominio.Proveedor;

public interface ProveedorService {
	/*
	 * @param Titulo del proveedor a añadir
	 * @returns nada jaja
	 */
	public void agregarProveedor(String titulo);
	
	/*
	 * @param Titulo del proveedor a borrar
	 * @returns nada de vuelta jaja
	 */
	public void borrarProveedor(String titulo);
	
	/*
	 * @param nada
	 * @returns un HashMap con todos los proveedores
	 */
	public HashMap<Integer, Proveedor> obtenerProvedores();
}

