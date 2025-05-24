package crud;
import sistemabibliograficos.Copia;
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
public class CopiaCrud {
  private static final List<Copia> listaCopias = new ArrayList<>();

    public static void agregar(Copia copia) {
        listaCopias.add(copia);
    }

    public static List<Copia> listarTodo() {
        return listaCopias;
    }

    public static Copia buscarPorUbicacion(String ubicacion) {
        for (Copia c : listaCopias) {
            if (c.getUbicacion().equalsIgnoreCase(ubicacion)) {
                return c;
            }
        }
        return null;
    }

    public static boolean actualizar(String ubicacion, Copia nueva) {
        Copia copia = buscarPorUbicacion(ubicacion);
        if (copia != null) {
            int index = listaCopias.indexOf(copia);
            listaCopias.set(index, nueva);
            return true;
        }
        return false;
    }

    public static boolean eliminar(String ubicacion) {
        Copia copia = buscarPorUbicacion(ubicacion);
        return listaCopias.remove(copia);
    }

    public static int contar() {
        return listaCopias.size();
    }  
}
