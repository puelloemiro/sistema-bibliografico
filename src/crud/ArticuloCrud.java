package crud;
import sistemabibliograficos.Articulo;
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
public class ArticuloCrud {
    
    private static final List<Articulo> listaArticulos = new ArrayList<>();


    public static void agregar(Articulo articulo) {
        listaArticulos.add(articulo);
    }

    
    public static List<Articulo> listarTodo() {
        return listaArticulos;
    }

   
    public static Articulo buscarPorTitulo(String titulo) {
    for (Articulo a : listaArticulos) {
        if (a.getTitulo().equalsIgnoreCase(titulo)) {
            return a;
        }
    }
    return null;
}

    public static boolean actualizar(String titulo, Articulo nuevoArticulo) {
        Articulo articulo = buscarPorTitulo(titulo);
        if (articulo != null) {
            int index = listaArticulos.indexOf(articulo);
            listaArticulos.set(index, nuevoArticulo);
            return true;
        }
        return false;
    }

    public static boolean eliminar(String titulo) {
        Articulo articulo = buscarPorTitulo(titulo);
        return listaArticulos.remove(articulo);
    }

   
    public static int contar() {
        return listaArticulos.size();
    }
}
