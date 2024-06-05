package unl.domain;

import java.util.Date;
public class Estudiante extends Persona {
    private NivelSocioEconomico nivelSocioEconomico;

    public Estudiante(String nombre, String apellido, String dui, Date fechaNacimiento, NivelSocioEconomico nivelSocioEconomico) {
        super(nombre, apellido, dui, fechaNacimiento);
        this.nivelSocioEconomico = nivelSocioEconomico;
    }

    public NivelSocioEconomico getNivelSocioEconomico() {
        return nivelSocioEconomico;
    }

    public void setNivelSocioEconomico(NivelSocioEconomico nivelSocioEconomico) {
        this.nivelSocioEconomico = nivelSocioEconomico;
    }

    @Override
    public String toString() {
        return "Estudiante{" +'\n'+
                super.toString() +'\n'+
                "  nivelSocioEconomico=" + nivelSocioEconomico +'\n'+
                '}';
    }

    @Override
    public void realizarActividad() {
        System.out.println("El estudiante recibe una clase.");
    }
}
