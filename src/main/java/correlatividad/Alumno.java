package correlatividad;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Getter
@Setter
public class Alumno {

    private String nombre;
    private String apellido;
    private List<Materia> materiasAprobadas = new ArrayList<>();
    private List<Materia> materiasEnCurso = new ArrayList<>();

    public void agregarMateriaAprobada(Materia ... materias) {
        materiasAprobadas.addAll(List.of(materias));
    }

    public void agregarMateriasEnCurso(Materia ... materias) {
        materiasEnCurso.addAll(List.of(materias));
    }

    public boolean corroborarCorrelativas(Materia materia) {

        List<Materia> correlativasRequeridas = materia.getCorrelativas();

        return this.materiasAprobadas.containsAll(correlativasRequeridas);
    }
}
