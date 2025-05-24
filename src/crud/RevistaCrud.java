package crud;

import sistemabibliograficos.Revista;
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
public class RevistaCrud {
   private static final List<Revista> listaRevistas = new ArrayList<>();

    public static void agregar(Revista revista) {
        listaRevistas.add(revista);
    }

    public static List<Revista> listarTodo() {
        return listaRevistas;
    }

    public static Revista buscarPorNombre(String nombre) {
        for (Revista r : listaRevistas) {
            if (r.getNombreRevista().equalsIgnoreCase(nombre)) {
                return r;
            }
        }
        return null;
    }

    public static boolean actualizar(String nombre, Revista nuevaRevista) {
        Revista revista = buscarPorNombre(nombre);
        if (revista != null) {
            int index = listaRevistas.indexOf(revista);
            listaRevistas.set(index, nuevaRevista);
            return true;
        }
        return false;
    }

    public static boolean eliminar(String nombre) {
        Revista revista = buscarPorNombre(nombre);
        return listaRevistas.remove(revista);
    }

    public static int contar() {
        return listaRevistas.size();
    } 
}
