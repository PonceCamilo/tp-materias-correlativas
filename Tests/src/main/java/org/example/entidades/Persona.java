package org.example.entidades;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Persona {

    private String nombre;
    private String apellido;
    private Direccion direccion;

    public String obtenerNombreCompleto(){
        return nombre + " " + apellido;
    }

}
