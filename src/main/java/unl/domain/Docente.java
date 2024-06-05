package unl.domain;

import java.util.Date;

public class Docente extends Empleado {
    private String tituloAcademico;

    public Docente(String nombre, String apellido, String dui, Date fechaNacimiento, String tituloAcademico) {
        super(nombre, apellido, dui, fechaNacimiento);
        this.tituloAcademico = tituloAcademico;
    }

    public String getTituloAcademico() {
        return tituloAcademico;
    }

    public void setTituloAcademico(String tituloAcademico) {
        this.tituloAcademico = tituloAcademico;
    }

    @Override
    public String toString() {
        return "Docente{" +'\n'+
                super.toString() +'\n'+
                "  tituloAcademico='" + tituloAcademico + '\n' +
                '}';
    }

    @Override
    public void realizarActividad() {
        System.out.println("El docente imparte clases.");
    }
}
