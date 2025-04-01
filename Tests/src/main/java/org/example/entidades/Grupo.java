package org.example.entidades;

import java.util.ArrayList;
import java.util.List;

public class Grupo {

    List<Persona> personas;

    public Grupo() {
        personas = new ArrayList<Persona>();
    }

    public boolean puedeEntrar(Persona persona) {

        return personas.size() < 10;
    }

    public void agregarPersona(Persona persona) {

        if(puedeEntrar(persona))
            personas.add(persona);
    }
}
