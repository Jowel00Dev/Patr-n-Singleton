package edu.konrad.vista;

import java.util.Scanner;

import edu.konrad.controlador.UsuarioLogica;

public class UsuarioVista {
	
	public void solicitarDatos() {
		Scanner sc = new Scanner(System.in);
		System.out.println("*** BIENVENIDO AL SISTEMA SINGLETON ***");
		System.out.println("Por favor ingresar usuario: ");
		String usuarioLeido = sc.nextLine();
		System.out.println("Por favor ingresar contrasena: ");
		String contrasenaLeida = sc.nextLine();
		
		UsuarioLogica logica = new UsuarioLogica();
		String mensajeRespuesta = logica.autenticar(usuarioLeido, contrasenaLeida);
		
		System.out.println(mensajeRespuesta);
	}

}
