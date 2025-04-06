package model;

public class Profesor extends Persona {
    private String asignatura;
    private int horasSemanales;

    public Profesor(String nombre, String apellido, String asignatura, int horasSemanales) {
        super(nombre, apellido);
        this.asignatura = asignatura;
        this.horasSemanales = horasSemanales;
    }

    @Override
    public String toString() {
        return "Profesor [asignatura=" + asignatura + ", horasSemanales=" + horasSemanales + ", " + super.toString() + "]";
    }

}
