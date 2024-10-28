package mx.ipn.upiicsa.poo.calcHerencia;

import mx.ipn.upiicsa.poo.calcHerencia.UI.CommandControl;
import mx.ipn.upiicsa.poo.calcHerencia.UI.Menu;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Verifica si hay argumentos, si no, permite al usuario elegir un modo de operación
        if (args.length == 0) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("Seleccione modo de uso:");
                System.out.println("-m -> menú");
                System.out.println("-p -> uso de argumentos");

                String modo = scanner.next();

                // Ejecuta la calculadora en modo menú
                if (modo.equals("-m")) {
                    new Menu().mostrarMenu();
                // Ejecuta la calculadora en modo de argumentos
                } else if (modo.equals("-p")) {
                    CommandControl.modoComando(args);
                } else {
                    System.out.println("Opción no válida.");
                }
            }
        } else {
            // Si hay argumentos, se ejecuta en modo comando
            CommandControl.modoComando(args);
        }
    }
}
