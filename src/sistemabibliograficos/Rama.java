/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabibliograficos;

/**
 *
 * @author usuario1
 */
public class Rama {
    private String nombre;
    private String tipoDocumento;
    private String lugarRedaccion;
    private String descripcion;
    private String genero;  // nuevo atributo agregado

    // Constructor
    public Rama(String nombre, String tipoDocumento, String lugarRedaccion, String descripcion, String genero) {
        this(nombre, tipoDocumento, lugarRedaccion, descripcion);
    }

    // Constructor
    public Rama(String nombre, String tipoDocumento, String lugarRedaccion, String descripcion) {
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.lugarRedaccion = lugarRedaccion;
        this.descripcion = descripcion;
        this.genero = genero;  // inicializado en constructor
    }

    // Getter y Setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter para tipoDocumento
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    // Getter y Setter para lugarRedaccion
    public String getLugarRedaccion() {
        return lugarRedaccion;
    }

    public void setLugarRedaccion(String lugarRedaccion) {
        this.lugarRedaccion = lugarRedaccion;
    }

    // Getter y Setter para descripcion
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Getter y Setter para genero
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}