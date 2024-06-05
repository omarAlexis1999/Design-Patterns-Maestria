package unl.domain;

import java.util.Date;
public abstract class Empleado extends Persona {
    public Empleado(String nombre, String apellido, String dui, Date fechaNacimiento) {
        super(nombre, apellido, dui, fechaNacimiento);
    }
}
