package mx.ipn.upiicsa.poo.calcHerencia;

import mx.ipn.upiicsa.poo.calcHerencia.UI.*;

public class App {
    public static void main(String[] args) {
         Menu menu = new Menu();

        // Si no se pasan argumentos, sale el menú
        if (args.length == 0) {
            menu.mostrarMenu();
        } else {
            // Modo línea de comandos
            CommandControl.modoComando(args);
        }
    }
}
