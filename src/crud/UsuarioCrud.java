package crud;
import sistemabibliograficos.Usuario;
import java.util.ArrayList;
import java.util.List;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario1
 */
public class UsuarioCrud {
   private static final List<Usuario> listaUsuarios = new ArrayList<>();

    public static void agregar(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public static List<Usuario> listarTodo() {
        return listaUsuarios;
    }

    public static Usuario buscarPorCorreo(String correo) {
        for (Usuario u : listaUsuarios) {
            if (u.getCorreo().equalsIgnoreCase(correo)) {
                return u;
            }
        }
        return null;
    }

    public static boolean actualizar(String correo, Usuario nuevo) {
        Usuario usuario = buscarPorCorreo(correo);
        if (usuario != null) {
            int index = listaUsuarios.indexOf(usuario);
            listaUsuarios.set(index, nuevo);
            return true;
        }
        return false;
    }

    public static boolean eliminar(String correo) {
        Usuario usuario = buscarPorCorreo(correo);
        return listaUsuarios.remove(usuario);
    }

    public static int contar() {
        return listaUsuarios.size();
    } 
}
