package edu.konrad.dao;

import java.util.List;

import edu.konrad.bd.BaseDatos;
import edu.konrad.modelo.Usuario;

public class UsuarioDAO {

    private static BaseDatos bd = BaseDatos.getInstancia();
    private List<Usuario> lista = bd.getListaUsuarios();
    private List<Usuario> usuariosEliminados;
    

    public boolean readUsuario(Usuario usuarioABuscar) {
        for (Usuario usuarioLista : lista) {
            if (usuarioLista.getUsuario().equals(usuarioABuscar.getUsuario()) && usuarioLista.getContrasena().equals(usuarioABuscar.getContrasena())) {
                return true;
            }
        }
        return false;
    }




    

    public boolean updateUsuario(Usuario usuarioAModificar, Usuario usuarioNuevo) {
        for (int i=0;i<lista.size();i++){
            if (lista.get(i).getUsuario().equals(usuarioAModificar.getUsuario())){
                lista.set(i, usuarioNuevo);
                bd.setListaUsuarios(lista);
                return true;
            }
        }
        return false;

    }



public boolean createUsuario(Usuario usuarioACrear) {
    for (Usuario usuarioLista : lista) {
        if (usuarioLista.getUsuario().equals(usuarioACrear.getUsuario())) {
            // El usuario ya existe, por lo que no podemos crearlo.
            return false;
        }
    }
    // El usuario no existe, así que podemos crearlo

    bd.addUsuario(usuarioACrear);
    return true;
    }


    public boolean deleteUsuario(Usuario usuarioAEliminar) {
      try{  
        for (int i=0;i<lista.size();i++){
            if (lista.get(i).getUsuario().equals(usuarioAEliminar.getUsuario())){
                lista.remove(i);
                return true;
            }
        }
        this.usuariosEliminados.add(usuarioAEliminar);
        bd.setListaUsuarios(lista);
        
    } catch (NullPointerException e) {
          System.out.println("No se encontro el usuario");
    }
        return false;
    
    }

}
