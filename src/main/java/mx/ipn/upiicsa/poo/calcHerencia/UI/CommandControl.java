package mx.ipn.upiicsa.poo.calcHerencia.UI;

import mx.ipn.upiicsa.poo.calcHerencia.Calculator.*;

public class CommandControl {
    // Método para gestionar el modo de línea de comandos
    public static void modoComando(String[] args) {
        ScientificCalculator calculator = new ScientificCalculator();

        if (args.length == 0) {
            System.out.println("Debe proporcionar un comando. Use -help para ver las opciones.");
            return;
        }

        // Interpretamos la opción
        String opcion = args[0];

        if (opcion.equals("-help")) {
            showHelp();
            return;
        } 
        
        if (args.length < 3) {
            System.out.println("Error: Se requieren al menos 3 argumentos (opción, operación y un número).");
            return;
        }

        String operacion = args[1];
        double a = Double.parseDouble(args[2]);
        double b = args.length > 3 ? Double.parseDouble(args[3]) : 0;

        switch (opcion) {
            case "-p":
                excecuteBasicOperation(calculator, operacion, a, b);
                break;
            case "-m":
                excecuteScientificOperation(calculator, operacion, a, b);
                break;
            default:
                System.out.println("Comando no reconocido. Use -help para ver las opciones.");
        }
    }

    public static void excecuteBasicOperation(ScientificCalculator calculator, String operacion, double a, double b) {
        // Ejecutamos la operación correspondiente
        switch (operacion) {
            case "-s":
                System.out.println("Resultado de la suma: " + calculator.suma(a, b));
                break;
            case "-r":
                System.out.println("Resultado de la resta: " + calculator.resta(a, b));
                break;
            case "-m":
                System.out.println("Resultado de la multiplicación: " + calculator.multiplicacion(a, b));
                break;
            case "-d":
                System.out.println("Resultado de la división: " + calculator.division(a, b));
                break;
            case "-p":
                System.out.println("Resultado del porcentaje: " + calculator.porcentaje(a, b));
                break;
            default:
                System.out.println("Comando no reconocido. Use -help para ver las opciones.");
        }
    }

    public static void excecuteScientificOperation(ScientificCalculator calculator, String operacion, double a, double b) {
        // Ejecutamos la operación correspondiente
        switch (operacion) {
            case "-pi":
                System.out.println("Resultado del piso: " + calculator.piso(a));
                break;
            case "-t":
                System.out.println("Resultado del techo: " + calculator.techo(a));
                break;
            case "-re":
                System.out.println("Resultado del redondeo: " + calculator.redondeo(a));
                break;
            case "-x2":
                System.out.println("Resultado de la potencia al cuadrado: " + calculator.potenciaCuadrado(a));
                break;
            case "-x3":
                System.out.println("Resultado de la potencia al cubo: " + calculator.potenciaCubo(a));
                break;
            case "-xn":
                System.out.println("Resultado de la potencia a la n: " + calculator.potenciaN(a, b));
                break;
            case "-x_2":
                System.out.println("Resultado de la raíz cuadrada: " + calculator.raizCuadrada(a));
                break;
            case "-x_3":
                System.out.println("Resultado de la raíz cúbica: " + calculator.raizCubica(a));
                break;
            case "-x_n":
                System.out.println("Resultado de la raíz n: " + calculator.raizN(a, b));
                break;
            case "-sin":
                System.out.println("Resultado del seno: " + calculator.seno(a));
                break;
            case "-cos":
                System.out.println("Resultado del coseno: " + calculator.coseno(a));
                break;
            case "-tan":
                System.out.println("Resultado de la tangente: " + calculator.tangente(a));
                break;
            case "-fact":
                System.out.println("Resultado del factorial: " + calculator.factorial((int) a));
                break;
            default:
                System.out.println("Comando no reconocido. Use -help para ver las opciones.");
        }
    }

    public static void showHelp() {
        System.out.println("Uso:");
        System.out.println("  -p -> Para operaciones básicas");
        System.out.println("  -m -> Para operaciones científicas");
        System.out.println("Modo -p:");
        System.out.println("  -p -s -> Suma");
        System.out.println("  -p -r -> Resta");
        System.out.println("  -p -m -> Multiplicación");
        System.out.println("  -p -d -> División");
        System.out.println("  -p -p -> Porcentaje");
        System.out.println("Ejemplo: -p -s 2 4");
        System.out.println("Salida: Resultado de la suma: 6");
        System.out.println("Modo -m:");
        System.out.println("  -m -pi -> Piso");
        System.out.println("  -m -t -> Techo");
        System.out.println("  -m -re -> Redondeo");
        System.out.println("  -m -x2 -> Potencia al cuadrado");
        System.out.println("  -m -x3 -> Potencia al cubo");
        System.out.println("  -m -xn -> Potencia a la n (se requiere un segundo número)");
        System.out.println("  -m -x_2 -> Raíz cuadrada");
        System.out.println("  -m -x_3 -> Raíz cúbica");
        System.out.println("  -m -x_n -> Raíz n (se requiere un segundo número)");
        System.out.println("  -m -sin -> Seno");
        System.out.println("  -m -cos -> Coseno");
        System.out.println("  -m -tan -> Tangente");
        System.out.println("  -m -fact -> Factorial");
        System.out.println("Ejemplo: -m -re 2.56789");
        System.out.println("Salida: Resultado del redondeo: 3.0");
    }
}