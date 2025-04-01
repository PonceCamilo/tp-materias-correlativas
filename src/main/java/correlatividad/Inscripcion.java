package correlatividad;

public class Inscripcion {

    public String inscribirAMateria(Alumno alumno, Materia materia) {

            if (alumno.corroborarCorrelativas(materia)) {
                alumno.agregarMateriasEnCurso(materia);
            } else {
                return "para inscribirse a " + materia.getNombre() + " faltan materias por aprobar";
            }
        return "inscripcion exitosa";
    }
}

