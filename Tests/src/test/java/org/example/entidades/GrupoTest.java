package org.example.entidades;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrupoTest {

    @Test
    @DisplayName("puede entrar la siguiente persona")
    public void puedeEntrarPersonaAGrupo(){

        Grupo grupo = new Grupo();

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();

        grupo.agregarPersona(persona1);
        grupo.agregarPersona(persona2);

        grupo.puedeEntrar(persona3);

        Assertions.assertTrue(grupo.puedeEntrar(persona3));
    }

}