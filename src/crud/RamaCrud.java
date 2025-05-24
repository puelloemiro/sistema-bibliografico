package crud;
import sistemabibliograficos.Rama;
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
public class RamaCrud {
    private static final List<Rama> listaRamas = new ArrayList<>();

    public static void agregar(Rama rama) {
        listaRamas.add(rama);
    }

    public static List<Rama> listarTodo() {
        return listaRamas;
    }

    public static Rama buscarPorGenero(String generoBuscado) {
        if (generoBuscado == null) {
            return null;  // o manejarlo de otra forma si quieres
        }
        for (Rama rama : listaRamas) {
            // validar que rama.getGenero() no sea null para evitar NPE
            if (generoBuscado.equals(rama.getGenero())) {
                return rama;
            }
        }
        return null;
    }

    public static boolean actualizar(String genero, Rama nueva) {
        Rama rama = buscarPorGenero(genero);
        if (rama != null) {
            int index = listaRamas.indexOf(rama);
            listaRamas.set(index, nueva);
            return true;
        }
        return false;
    }

    public static boolean eliminar(String genero) {
        Rama rama = buscarPorGenero(genero);
        return rama != null && listaRamas.remove(rama);
    }

    public static int contar() {
        return listaRamas.size();
    }  
}