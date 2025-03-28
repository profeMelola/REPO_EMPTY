import model.Persona;
import util.Utilidades;

public class App {
    public static void main(String[] args) throws Exception {
        Persona persona = new Persona("Mari Luz", "Elola");
        Utilidades.imprimir(persona.toString());
    }
}
