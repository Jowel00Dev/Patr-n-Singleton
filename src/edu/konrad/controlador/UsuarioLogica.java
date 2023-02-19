package edu.konrad.controlador;

import edu.konrad.dao.UsuarioDAO;
import edu.konrad.modelo.Usuario;

public class UsuarioLogica {
	
	private UsuarioDAO dao;
	
	public String autenticar(String user, String pwd) {
		Usuario usuario = new Usuario(user, pwd);
		dao = new UsuarioDAO();
		
		boolean respuesta = dao.readUsuario(usuario);
		
		if(respuesta == true) {
			return "Autenticacion exitosa";
		}else {
			return "Credenciales incorrectas";
		}
	}

}
