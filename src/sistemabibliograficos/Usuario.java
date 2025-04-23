/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabibliograficos;

/**
 *
 * @author usuario1
 */
public class Usuario {
    private String nombre;
    private String username;
    private String correo;

    public Usuario(String nombre, String username, String correo) {
        this.nombre = nombre;
        this.username = username;
        this.correo = correo;
    }
    public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

// Getter y Setter para username
public String getUsername() {
    return username;
}

public void setUsername(String username) {
    this.username = username;
}

// Getter y Setter para correo
public String getCorreo() {
    return correo;
}

public void setCorreo(String correo) {
    this.correo = correo;
}
    
}