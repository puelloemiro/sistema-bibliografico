/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabibliograficos;

/**
 *
 * @author usuario1
 */
public class InformeTecnico {
    private String idInforme;
    private String titulo;
    private String resumen;
    private String centroPublicacion;
    private String mesPublicacion;
    private int añoPublicacion;
    private String ubicacionFisica;
    private boolean disponible;

    public InformeTecnico() {
    }

    public InformeTecnico(String idInforme, String titulo, String resumen, String centroPublicacion,
                          String mesPublicacion, int añoPublicacion, String ubicacionFisica, boolean disponible) {
        this.idInforme = idInforme;
        this.titulo = titulo;
        this.resumen = resumen;
        this.centroPublicacion = centroPublicacion;
        this.mesPublicacion = mesPublicacion;
        this.añoPublicacion = añoPublicacion;
        this.ubicacionFisica = ubicacionFisica;
        this.disponible = disponible;
    }  
        public String getIdInforme() {
    return idInforme;
}

public void setIdInforme(String idInforme) {
    this.idInforme = idInforme;
}

// Getter y Setter para titulo
public String getTitulo() {
    return titulo;
}

public void setTitulo(String titulo) {
    this.titulo = titulo;
}

// Getter y Setter para resumen
public String getResumen() {
    return resumen;
}

public void setResumen(String resumen) {
    this.resumen = resumen;
}

// Getter y Setter para centroPublicacion
public String getCentroPublicacion() {
    return centroPublicacion;
}

public void setCentroPublicacion(String centroPublicacion) {
    this.centroPublicacion = centroPublicacion;
}

// Getter y Setter para mesPublicacion
public String getMesPublicacion() {
    return mesPublicacion;
}

public void setMesPublicacion(String mesPublicacion) {
    this.mesPublicacion = mesPublicacion;
}

// Getter y Setter para añoPublicacion
public int getAñoPublicacion() {
    return añoPublicacion;
}

public void setAñoPublicacion(int añoPublicacion) {
    this.añoPublicacion = añoPublicacion;
}

// Getter y Setter para ubicacionFisica
public String getUbicacionFisica() {
    return ubicacionFisica;
}

public void setUbicacionFisica(String ubicacionFisica) {
    this.ubicacionFisica = ubicacionFisica;
}

// Getter y Setter para disponible
public boolean isDisponible() {
    return disponible;
}

public void setDisponible(boolean disponible) {
    this.disponible = disponible;
}
        
    }
