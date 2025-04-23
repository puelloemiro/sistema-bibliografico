/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabibliograficos;

/**
 *
 * @author usuario1
 */
public class Copia {
    private String tipo;
    private String ubicacion;
    private String enlace;
    private boolean disponibilidad;

  
    // Constructor
    public Copia(String tipo, String ubicacion, boolean disponibilidad) {
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.disponibilidad = disponibilidad;
    } 
        public String getTipo() {
    return tipo;
}

public void setTipo(String tipo) {
    this.tipo = tipo;
}

// Getter y Setter para ubicacion
public String getUbicacion() {
    return ubicacion;
}

public void setUbicacion(String ubicacion) {
    this.ubicacion = ubicacion;
}


public boolean getisDisponibilidad() {
    return disponibilidad;
}

public void setDisponibilidad(boolean disponibilidad) {
    this.disponibilidad = disponibilidad;
}
}
        
        
        
        
        
    
