import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona("Luca", "Rossi", 25, "verde");
        Persona persona2 = new Persona("Marco", "Rossi", 25, "verde");

        persona1.saluta(persona2);
        persona2.saluta(persona1);
    }
}
