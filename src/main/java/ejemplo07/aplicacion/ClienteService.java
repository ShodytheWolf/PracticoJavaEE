package ejemplo07.aplicacion;

import java.util.List;

import ejemplo07.dominio.Cliente;
//esta es la capa de interfaz
public interface ClienteService {
	
	public void agregarCliente(String nombre);
	public void borrarCliente(int id);
	public List<Cliente> obtenerClientes();

}
