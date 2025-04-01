package org.example.entidades;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    @Test
    @DisplayName("corroborar nombre")
    public void obtenerNombreCompleto() {
        Persona persona = new Persona();
        persona.setNombre("camilo");
        persona.setApellido("ponce");

        Assertions.assertEquals("camilo ponce", persona.obtenerNombreCompleto());
    }

}