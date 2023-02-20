package edu.konrad.dao;

import java.util.List;

import edu.konrad.bd.BaseDatos;
import edu.konrad.modelo.Usuario;

public class UsuarioDAO {

    private static BaseDatos bd = BaseDatos.getInstancia();
    private static List<Usuario> lista = bd.getListaUsuarios();

    public boolean readUsuario(Usuario usuarioABuscar) {
        for (Usuario usuarioLista : lista) {
            if (usuarioLista.getUsuario().equals(usuarioABuscar.getUsuario()) && usuarioLista.getContrasena().equals(usuarioABuscar.getContrasena())) {
                return true;
            }
        }
        return false;
    }

    public boolean createUsuario(Usuario usuarioACrear) {
        for (Usuario usuarioLista : lista) {
            if (usuarioLista.getUsuario() == usuarioACrear.getUsuario()) {
                bd.addUsuario(usuarioACrear);
                return true;
            }
        }

        return false;
    }

    public boolean updateUsuario(Usuario usuarioAModificar, Usuario usuarioNuevo) {
        int indice = -1;
        indice = lista.indexOf(usuarioAModificar);
        if (indice != -1) {
            lista.set(indice, usuarioNuevo);
            return true;
        }
        return false;

    }

    public boolean deleteUsuario(Usuario usuarioAEliminar) {
        return false;
    }

}
