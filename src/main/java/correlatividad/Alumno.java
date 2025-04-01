package correlatividad;

import lombok.Getter;

import java.util.HashSet;
import java.util.List;

@Getter
public class Alumno {

    private String nombre;
    private String apellido;
    private List<Materia> materiasAprobadas;
    private List<Materia> materiasEnCurso;

    public void agregarMateriaAprobada(Materia ... materias) {
        materiasAprobadas.addAll(List.of(materias));
    }

    public void agregarMateriasEnCurso(Materia ... materias) {
        materiasEnCurso.addAll(List.of(materias));
    }

    public boolean corroborarCorrelativas(Materia materia) {
        return new HashSet<>(materiasAprobadas).containsAll(materia.getCorrelativas());
    }
}
