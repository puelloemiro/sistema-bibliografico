package crud;
import sistemabibliograficos.InformeTecnico;
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
public class InformeTecnicoCrud {
    private static final List<InformeTecnico> listaInformes = new ArrayList<>();

    public static void agregar(InformeTecnico informe) {
        listaInformes.add(informe);
    }

    public static List<InformeTecnico> listarTodo() {
        return listaInformes;
    }

    public static InformeTecnico buscarPorTitulo(String titulo) {
        for (InformeTecnico i : listaInformes) {
            if (i.getTitulo().equalsIgnoreCase(titulo)) {
                return i;
            }
        }
        return null;
    }

    public static boolean actualizar(String titulo, InformeTecnico nuevo) {
        InformeTecnico informe = buscarPorTitulo(titulo);
        if (informe != null) {
            int index = listaInformes.indexOf(informe);
            listaInformes.set(index, nuevo);
            return true;
        }
        return false;
    }

    public static boolean eliminar(String titulo) {
        InformeTecnico informe = buscarPorTitulo(titulo);
        return listaInformes.remove(informe);
    }

    public static int contar() {
        return listaInformes.size();
    }
}
