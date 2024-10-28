package mx.ipn.upiicsa.poo.calcHerencia.UI;

import mx.ipn.upiicsa.poo.calcHerencia.Calculator.*;

public class CommandControl {
    // Ejecuta el modo comando en base a los argumentos dados
    public static void modoComando(String[] args) {
        ScientificCalculator calculator = new ScientificCalculator();

        // Si no hay argumentos o si el primer argumento es "-help", muestra ayuda
        if (args.length == 0 || args[0].equals("-help")) {
            showHelp();
            return;
        } else if (args.length < 3) {
            System.out.println("Error: Se requieren al menos 3 argumentos (operación y número(s)).");
            showHelp();
            return;
        }

        // Obtiene la operación y los valores numéricos de los argumentos
        String operacion = args[1];
        double a = Double.parseDouble(args[2]);
        double b = args.length > 3 ? Double.parseDouble(args[3]) : 0;

        // Ejecuta la operación correspondiente
        executeOperation(calculator, operacion, a, b);
    }

    // Ejecuta la operación seleccionada e imprime el resultado
    private static void executeOperation(ScientificCalculator calculator, String operacion, double a, double b) {
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
                System.out.println("Operación no reconocida. Use -help para ver las opciones.");
        }
    }

    // Muestra la ayuda de los comandos disponibles en modo comando
    public static void showHelp() {
        System.out.println("Uso de la calculadora:");
        System.out.println("  -p -s -> Suma");
        System.out.println("  -p -r -> Resta");
        System.out.println("  -p -m -> Multiplicación");
        System.out.println("  -p -d -> División");
        System.out.println("  -p -p -> Porcentaje");
        System.out.println("  -p -pi -> Piso");
        System.out.println("  -p -t -> Techo");
        System.out.println("  -p -re -> Redondeo");
        System.out.println("  -p -x2 -> Potencia al cuadrado");
        System.out.println("  -p -x3 -> Potencia al cubo");
        System.out.println("  -p -xn -> Potencia a la n (se requiere un segundo número)");
        System.out.println("  -p -x_2 -> Raíz cuadrada");
        System.out.println("  -p -x_3 -> Raíz cúbica");
        System.out.println("  -p -x_n -> Raíz n (se requiere un segundo número)");
        System.out.println("  -p -sin -> Seno");
        System.out.println("  -p -cos -> Coseno");
        System.out.println("  -p -tan -> Tangente");
        System.out.println("  -p -fact -> Factorial");
        System.out.println("Ejemplo: -p -re 2.56789");
        System.out.println("Salida: Resultado del redondeo: 3.0");
    }
}
