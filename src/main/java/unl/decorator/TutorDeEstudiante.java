package unl.decorator;

public class TutorDeEstudiante extends PersonaDecorator {

    public TutorDeEstudiante(IPersona personaDecorada) {
        super(personaDecorada);
    }

    @Override
    public void realizarActividad() {
        personaDecorada.realizarActividad();
        agregarResponsabilidad();
    }

    private void agregarResponsabilidad() {
        System.out.println("Además, es tutor de estudiantes.");
    }
}
