package crud;
import sistemabibliograficos.Autor;
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
public class AutorCrud {

    private static final List<Autor> listaAutores = new ArrayList<>();

    public static void agregar(Autor autor) {
        listaAutores.add(autor);
    }

    public static List<Autor> listarTodo() {
        return listaAutores;
    }

    public static Autor buscarPorNombre(String nombre) {
        for (Autor a : listaAutores) {
            if (a.getNombre().equals(nombre)) {
                return a;
            }
        }
        return null;
    }

    public static boolean actualizar(String nombre, Autor nuevoAutor) {
        Autor autor1 = buscarPorNombre(nombre);
        if (autor1 != null) {
            int index = listaAutores.indexOf(autor1);
            listaAutores.set(index, nuevoAutor);
            return true;
        }
        return false;
    }

    public static boolean eliminar(String nombre) {
        Autor autor = buscarPorNombre(nombre);
        return listaAutores.remove(autor);
    }

    public static int contar() {
        return listaAutores.size();
    }
}