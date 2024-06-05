package unl.decorator;

public class ResponsableDeLaboratorio extends PersonaDecorator {

    public ResponsableDeLaboratorio(IPersona personaDecorada) {
        super(personaDecorada);
    }

    @Override
    public void realizarActividad() {
        personaDecorada.realizarActividad();
        agregarResponsabilidad();
    }

    private void agregarResponsabilidad() {
        System.out.println("Además, es responsable de laboratorio.");
    }
}
