package correlatividad;

public class Inscripcion {

    public String inscribirAMateria(Alumno alumno, Materia ... materiasACursar) {

        for (Materia materia : materiasACursar) {
            if (alumno.corroborarCorrelativas(materia)) {
                alumno.agregarMateriasEnCurso(materia);
                return "La materia " + materia + " se inscribio con exito";
            } else {
                return "para inscribirse a " + materia + " faltan materias por aprobar";
            }
        }
        return "fin inscripcion";
    }
}

