package crud;
import sistemabibliograficos.Congreso;
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
public class CongresoCrud {
    private static final List<Congreso> listaCongresos = new ArrayList<>();

    public static void agregar(Congreso congreso) {
        listaCongresos.add(congreso);
    }

    public static List<Congreso> listarTodo() {
        return listaCongresos;
    }

    public static Congreso buscarPorNombre(String nombre) {
        for (Congreso c : listaCongresos) {
            if (c.getNombre().equals(nombre)) {
                return c;
            }
        }
        return null;
    }

    public static boolean actualizar(String nombre, Congreso nuevo) {
        Congreso congreso = buscarPorNombre(nombre);
        if (congreso != null) {
            int index = listaCongresos.indexOf(congreso);
            listaCongresos.set(index, nuevo);
            return true;
        }
        return false;
    }

    public static boolean eliminar(String nombre) {
        Congreso congreso = buscarPorNombre(nombre);
        return listaCongresos.remove(congreso);
    }

    public static int contar() {
        return listaCongresos.size();
    }
}