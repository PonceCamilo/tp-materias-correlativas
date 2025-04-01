package correlatividad;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.List;

class Testeos {

    @org.junit.jupiter.api.Test
    @DisplayName("corrobora correlativas aprobadas en falso")
    public void corroborarCorrelativasEnFalso() {

        Materia matematica = new Materia();
        matematica.setNombre("matematica");
        Materia fisica = new Materia();
        fisica.setNombre("fisica");
        Materia superior = new Materia();
        superior.setNombre("superior");
        Materia analisis1 = new Materia();
        analisis1.setNombre("analisis1");
        Materia analisis2 = new Materia();
        analisis2.setNombre("analisis2");
        Materia analisis3 = new Materia();
        analisis3.setNombre("analisis3");
        Materia quimica = new Materia();
        quimica.setNombre("quimica");

        Alumno camilo = new Alumno();
        camilo.setNombre("Camilo");
        camilo.setApellido("ponce");

        analisis2.setCorrelativas(List.of(matematica, superior, analisis1));

        camilo.setMateriasAprobadas(List.of(matematica, fisica));
        camilo.setMateriasEnCurso(List.of(superior));

        Assertions.assertFalse(camilo.corroborarCorrelativas(analisis2));
    }

    @org.junit.jupiter.api.Test
    @DisplayName("corrobora correlativas aprobadas en verdadero")
    public void corroborarCorrelativasEnVerdadero() {

        Materia matematica = new Materia();
        matematica.setNombre("matematica");
        Materia fisica = new Materia();
        fisica.setNombre("fisica");
        Materia superior = new Materia();
        superior.setNombre("superior");
        Materia analisis1 = new Materia();
        analisis1.setNombre("analisis1");
        Materia analisis2 = new Materia();
        analisis2.setNombre("analisis2");
        Materia analisis3 = new Materia();
        analisis3.setNombre("analisis3");
        Materia quimica = new Materia();
        quimica.setNombre("quimica");;

        Alumno camilo = new Alumno();
        camilo.setNombre("Camilo");
        camilo.setApellido("ponce");

        analisis3.setCorrelativas(List.of(matematica, fisica));

        camilo.setMateriasAprobadas(List.of(matematica, fisica));
        camilo.setMateriasEnCurso(List.of(superior));

        Assertions.assertTrue(camilo.corroborarCorrelativas(analisis3));
    }

    @org.junit.jupiter.api.Test
    @DisplayName("inscribir alumno a materia en falso")
    public void inscribirAlumnoAMateriaEnFalso() {

        Inscripcion inscripcion = new Inscripcion();

        Materia matematica = new Materia();
        matematica.setNombre("matematica");
        Materia fisica = new Materia();
        fisica.setNombre("fisica");
        Materia superior = new Materia();
        superior.setNombre("superior");
        Materia analisis1 = new Materia();
        analisis1.setNombre("analisis1");
        Materia analisis2 = new Materia();
        analisis2.setNombre("analisis2");
        Materia analisis3 = new Materia();
        analisis3.setNombre("analisis3");
        Materia quimica = new Materia();
        quimica.setNombre("quimica");

        Alumno camilo = new Alumno();
        camilo.setNombre("Camilo");
        camilo.setApellido("ponce");

        analisis2.setCorrelativas(List.of(matematica, superior, analisis1));

        camilo.setMateriasAprobadas(List.of(matematica, fisica));
        camilo.setMateriasEnCurso(List.of(superior));

        Assertions.assertEquals("para inscribirse a analisis2 faltan materias por aprobar", inscripcion.inscribirAMateria(camilo, analisis2));
    }

    @org.junit.jupiter.api.Test
    @DisplayName("inscribir alumno a materia en verdadero")
    public void inscribirAlumnoAMateriaEnVerdadero() {

        Inscripcion inscripcion = new Inscripcion();

        Materia matematica = new Materia();
        matematica.setNombre("matematica");
        Materia fisica = new Materia();
        fisica.setNombre("fisica");
        Materia superior = new Materia();
        superior.setNombre("superior");
        Materia analisis1 = new Materia();
        analisis1.setNombre("analisis1");
        Materia analisis2 = new Materia();
        analisis2.setNombre("analisis2");
        Materia analisis3 = new Materia();
        analisis3.setNombre("analisis3");
        Materia quimica = new Materia();
        quimica.setNombre("quimica");

        Alumno camilo = new Alumno();
        camilo.setNombre("Camilo");
        camilo.setApellido("ponce");

        analisis3.setCorrelativas(List.of(matematica, fisica));

        camilo.setMateriasAprobadas(List.of(matematica, fisica, quimica));
        camilo.setMateriasEnCurso(new ArrayList<>(List.of(superior)));

        Assertions.assertEquals("inscripcion exitosa", inscripcion.inscribirAMateria(camilo, analisis3));
    }

    @org.junit.jupiter.api.Test
    @DisplayName("inscribir alumno a materia en despues de aprobar materia")
    public void inscribirAlumnoAMateriaDespuesDeAprobarMateria() {

        Inscripcion inscripcion = new Inscripcion();

        Materia matematica = new Materia();
        matematica.setNombre("matematica");
        Materia fisica = new Materia();
        fisica.setNombre("fisica");
        Materia superior = new Materia();
        superior.setNombre("superior");
        Materia analisis1 = new Materia();
        analisis1.setNombre("analisis1");
        Materia analisis2 = new Materia();
        analisis2.setNombre("analisis2");
        Materia analisis3 = new Materia();
        analisis3.setNombre("analisis3");
        Materia quimica = new Materia();
        quimica.setNombre("quimica");

        Alumno camilo = new Alumno();
        camilo.setNombre("Camilo");
        camilo.setApellido("ponce");

        analisis2.setCorrelativas(List.of(matematica, fisica, analisis1));

        camilo.setMateriasAprobadas(new ArrayList<>(List.of(matematica, fisica, quimica)));
        camilo.setMateriasEnCurso(new ArrayList<>(List.of(superior)));

        camilo.agregarMateriaAprobada(analisis1);

        Assertions.assertEquals("inscripcion exitosa", inscripcion.inscribirAMateria(camilo, analisis2));
    }
}