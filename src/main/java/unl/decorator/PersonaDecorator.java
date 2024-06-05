package unl.decorator;

public abstract class PersonaDecorator implements IPersona {
    protected IPersona personaDecorada;

    public PersonaDecorator(IPersona personaDecorada) {
        this.personaDecorada = personaDecorada;
    }

    @Override
    public void realizarActividad() {
        personaDecorada.realizarActividad();
    }
}
