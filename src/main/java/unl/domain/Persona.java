package unl.domain;

import unl.decorator.IPersona;

import java.util.Date;
import java.util.UUID;

// Clase base para todas las personas
public abstract class Persona implements IPersona {

    private String uuid;
    private String nombre;
    private String apellido;
    private String dui;
    private Date fechaNacimiento;

    public Persona(String nombre, String apellido, String dui, Date fechaNacimiento) {
        uuid= UUID.randomUUID().toString();
        this.nombre = nombre;
        this.apellido = apellido;
        this.dui = dui;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "  uuid='" + uuid + '\n' +
                "  nombre='" + nombre + '\n' +
                "  apellido='" + apellido + '\n' +
                "  dui='" + dui + '\n' +
                "  fechaNacimiento=" + fechaNacimiento +'\n'+
        '}';
    }

    public abstract void realizarActividad();
}