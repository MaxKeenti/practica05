package mx.ipn.upiicsa.poo.calcHerencia;

import java.util.Scanner;
import mx.ipn.upiicsa.poo.calcHerencia.UI.CommandControl;
import mx.ipn.upiicsa.poo.calcHerencia.UI.Menu;

public class App {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Seleccione modo de uso:");
            System.out.println("-m -> menú");
            System.out.println("-p -> uso de argumentos");
            
            Scanner scanner = new Scanner(System.in);
            String modo = scanner.next();

            if (modo.equals("-m")) {
                new Menu().mostrarMenu();
            } else if (modo.equals("-p")) {
                CommandControl.modoComando(args); // Enviará a -help para mostrar las opciones
            } else {
                System.out.println("Opción no válida.");
            }
            
        } else {
            // Si hay argumentos, se procede con el modo de comando directamente.
            CommandControl.modoComando(args);
        }
    }
}