/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabibliograficos;

/**
 *
 * @author usuario1
 */

 public class Congreso {
    private String nombreCongreso;
    private String ciudad;
    private int año;
    private String tema;

    public Congreso(String nombreCongreso, String ciudad, int año, String tema) {
        this.nombreCongreso = nombreCongreso;
        this.ciudad = ciudad;
        this.año = año;
        this.tema = tema;   
    }  

    public String getNombre() {
        return nombreCongreso;
    }

    public void setNombre(String nombreCongreso) {
        this.nombreCongreso = nombreCongreso;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}
        
        
        
