/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;
import sistemabibliograficos.Articulo;
import sistemabibliograficos.Autor;
import sistemabibliograficos.Congreso;
import sistemabibliograficos.Copia;
import sistemabibliograficos.Rama;
import sistemabibliograficos.InformeTecnico;
import sistemabibliograficos.Revista;
import sistemabibliograficos.Usuario;

/**
 *
 * @author usuario1
 */
public class Principal {
    public static void main (String []args){
    
        Articulo Articulo1= new Articulo ("racismo",1600,"libertad, esclavitud rebelion","historico");

        System.out.println(" tema del articulo: ");
        Articulo1.setTitulo("libertad");
        System.out.println(Articulo1.getTipo());
    
        Autor Autor1= new Autor ("Emiro","colombiano",23,"filosofica");
        
        System.out.println("datos del autor:");
        Autor1.setNombre("andres");
        System.out.println(Autor1.getEdad());
        
        Congreso Congreso1=new Congreso ("derechos civiles actuales","cartagena",2024,"derechos civiles");
        
        System.out.println("informacion del congreso");
        Congreso1.setNombreCongreso("Derechos humanos");
        System.out.println(Congreso1.getNombreCongreso());
        
        
        Copia Copia1 = new Copia ("fisica", "estanteria a", true);
        
        System.out.println("informacion de la copia");
        Copia1.setDisponibilidad(true);
        System.out.println(Copia1.getisDisponibilidad());
        
        
        InformeTecnico InformeTecnico1= new InformeTecnico ("INF12345","El Impacto del Cambio Climático en el mundo","Este informe aborda cómo el cambio climático afecta el planeta","Centro de Estudio climatico","Mayo",2023,"Estante 5, Sección A, Biblioteca Principal",true);
        
        System.out.println("Informe tecnico");
        InformeTecnico1.setTitulo("resumen");
        System.out.println(InformeTecnico1.getResumen());
        
        Rama Rama1= new Rama ("filosofia","ensayo","universidad de los Cartagena","este documento habla sobre la filosofia a lo largo de los tiempos");
        
        System.out.println("genero del documento");
        Rama1.setDescripcion("descripcion");
        System.out.println(Rama1.getTipoDocumento());
        
        Revista Revista1= new Revista ("el espectador","social","estante a nivel b",2);
        
        System.out.println("datos de la revista");
        Revista1.setNombreRevista("nombreRevista");
        System.out.println(Revista1.getRama());
        
        Usuario Usuario1= new Usuario ("andres","andres31","andres31@gmail");
        
        System.out.println("datos de usuario");
        Usuario1.setUsername("andres31");
        System.out.println(Usuario1.getNombre());

    }
    }   
