/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabibliograficos;

/**
 *
 * @author usuario1
 */
public class Revista {
    private String nombreRevista;
    private String rama;
    private String ubicacionEstanteria;
    private int copias;

    // Constructor
    public Revista(String nombreRevista, String rama, String ubicacionEstanteria, int copias) {
        this.nombreRevista = nombreRevista;
        this.rama = rama;
        this.ubicacionEstanteria = ubicacionEstanteria;
        this.copias = copias;
    }

    // Getter y Setter para nombreRevista
    public String getNombreRevista() {
        return nombreRevista;
    }

    public void setNombreRevista(String nombreRevista) {
        this.nombreRevista = nombreRevista;
    }

    // Getter y Setter para rama
    public String getRama() {
        return rama;
    }

    public void setRama(String rama) {
        this.rama = rama;
    }

    // Getter y Setter para ubicacionEstanteria
    public String getUbicacionEstanteria() {
        return ubicacionEstanteria;
    }

    public void setUbicacionEstanteria(String ubicacionEstanteria) {
        this.ubicacionEstanteria = ubicacionEstanteria;
    }

    // Getter y Setter para copias
    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }
}