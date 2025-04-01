package correlatividad;

import com.sun.jdi.VoidValue;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Materia {

    private String nombre;
    private List<Materia> correlativas;

    public void nombre(String nombre) {

        this.nombre = nombre;
    }

    public void agregarCorrelativa(Materia ... materias) {
        correlativas.addAll(List.of(materias));
    }
}