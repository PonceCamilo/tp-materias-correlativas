package correlatividad;

import lombok.Getter;

import java.util.List;

@Getter
public class Materia {

    private String nombre;
    private List<Materia> correlativas;

}