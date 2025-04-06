import java.time.LocalDateTime;

import model.Persona;
import util.Utilidades;

public class App {
    public static void main(String[] args) throws Exception {
        Persona persona = new Persona("Mari Luz", "Elola");
        Utilidades.imprimir(persona.toString());

        System.out.println("Fecha del sistema: " + LocalDateTime.now());


        System.out.println("Añadida clase Profesor en el paquete model");
    }
}
