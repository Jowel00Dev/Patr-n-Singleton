package edu.konrad.dao;

import java.util.List;

import edu.konrad.bd.BaseDatos;
import edu.konrad.modelo.Usuario;

public class UsuarioDAO {
	
	public boolean readUsuario(Usuario usuarioABuscar) {
		BaseDatos bd = BaseDatos.getInstancia();
		List<Usuario> lista = bd.getListaUsuarios();
		for(Usuario usuarioLista : lista) {
			if(usuarioLista.getUsuario().equals(usuarioABuscar.getUsuario()) && usuarioLista.getContrasena().equals(usuarioABuscar.getContrasena())) {
				return true;
			}
		}
		return false;
	}
	
	public boolean createUsuario(Usuario usuarioACrear) {
		return false;
	}

	public boolean updateUsuario(Usuario usuarioAModificar) {
		return false;
	}
	
	public boolean deleteUsuario(Usuario usuarioAEliminar) {
		return false;
	}
	
}
