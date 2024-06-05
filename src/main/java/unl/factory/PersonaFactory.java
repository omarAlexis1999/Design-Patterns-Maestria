package unl.factory;

import java.util.Date;
import unl.decorator.IPersona;
import unl.domain.*;

public class PersonaFactory {
    public static IPersona crearPersona(String tipo, String nombre, String apellido, String dui, Date fechaNacimiento, String extraInfo) {
        switch (tipo.toLowerCase()) {
            case "estudiante":
                NivelSocioEconomico nivelSocioEconomico = NivelSocioEconomico.valueOf(extraInfo.toUpperCase());
                return new Estudiante(nombre, apellido, dui, fechaNacimiento, nivelSocioEconomico);
            case "docente":
                return new Docente(nombre, apellido, dui, fechaNacimiento, extraInfo);
            case "administrativo":
                return new Administrativo(nombre, apellido, dui, fechaNacimiento, extraInfo);
            default:
                throw new IllegalArgumentException("Tipo de persona desconocido.");
        }
    }
}


