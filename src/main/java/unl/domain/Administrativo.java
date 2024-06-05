package unl.domain;

import java.util.Date;
public class Administrativo extends Empleado {
    private String cargo;

    public Administrativo(String nombre, String apellido, String dui, Date fechaNacimiento, String cargo) {
        super(nombre, apellido, dui, fechaNacimiento);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Administrativo{"  +'\n'+
                super.toString()  +'\n'+
                "  cargo='" + cargo  +'\n'+
                '}';
    }

    @Override
    public void realizarActividad() {
        System.out.println("El administrativo realiza trámites.");
    }
}