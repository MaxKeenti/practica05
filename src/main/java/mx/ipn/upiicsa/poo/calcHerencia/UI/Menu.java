package mx.ipn.upiicsa.poo.calcHerencia.UI;

import mx.ipn.upiicsa.poo.calcHerencia.Calculator.*;
import java.util.Scanner;

public class Menu {
    
    private ScientificCalculator calculator;
    private Scanner scanner;

    public Menu() {
        this.calculator = new ScientificCalculator();
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("Seleccione una operación a realizar:");
        System.out.println("Calculadora básica:");
        System.out.println("s - Suma");
        System.out.println("r - Resta");
        System.out.println("m - Multiplicación");
        System.out.println("d - División");
        System.out.println("p - Porcentaje");
        System.out.println("Calculadora científica:");
        System.out.println("pi - Piso");
        System.out.println("t - Techo");
        System.out.println("re - Redondeo");
        System.out.println("x2 - Potencia al cuadrado");
        System.out.println("x3 - Potencia al cubo");
        System.out.println("xn - Potencia a la n");
        System.out.println("x_2 - Raíz cuadrada");
        System.out.println("x_3 - Raíz cúbica");
        System.out.println("x_n - Raíz n");
        System.out.println("sin - Seno");
        System.out.println("cos - Coseno");
        System.out.println("tan - Tangente");
        System.out.println("fact - Factorial");

        String operacion = scanner.next();
        double a, b = 0;

        System.out.print("Ingrese el primer número: ");
        a = scanner.nextDouble();

        // Determinamos si se necesita un segundo número para la operación
        if (operacion.equals("xn") || operacion.equals("x_n")) {
            System.out.print("Ingrese el segundo número: ");
            b = scanner.nextDouble();
        } else if (!operacion.equals("pi") && !operacion.equals("t") && !operacion.equals("re") 
                   && !operacion.equals("x2") && !operacion.equals("x3") 
                   && !operacion.equals("x_2") && !operacion.equals("x_3") 
                   && !operacion.equals("sin") && !operacion.equals("cos") 
                   && !operacion.equals("tan") && !operacion.equals("fact")) {
            System.out.print("Ingrese el segundo número: ");
            b = scanner.nextDouble();
        }

        switch (operacion) {
            case "s":
                System.out.println("Resultado: " + calculator.suma(a, b));
                break;
            case "r":
                System.out.println("Resultado: " + calculator.resta(a, b));
                break;
            case "m":
                System.out.println("Resultado: " + calculator.multiplicacion(a, b));
                break;
            case "d":
                System.out.println("Resultado: " + calculator.division(a, b));
                break;
            case "p":
                System.out.println("Resultado: " + calculator.porcentaje(a, b));
                break;
            case "pi":
                System.out.println("Resultado: " + calculator.piso(a));
                break;
            case "t":
                System.out.println("Resultado: " + calculator.techo(a));
                break;
            case "re":
                System.out.println("Resultado: " + calculator.redondeo(a));
                break;
            case "x2":
                System.out.println("Resultado: " + calculator.potenciaCuadrado(a));
                break;
            case "x3":
                System.out.println("Resultado: " + calculator.potenciaCubo(a));
                break;
            case "xn":
                System.out.println("Resultado: " + calculator.potenciaN(a, b));
                break;
            case "x_2":
                System.out.println("Resultado: " + calculator.raizCuadrada(a));
                break;
            case "x_3":
                System.out.println("Resultado: " + calculator.raizCubica(a));
                break;
            case "x_n":
                System.out.println("Resultado: " + calculator.raizN(a, b));
                break;
            case "sin":
                System.out.println("Resultado: " + calculator.seno(a));
                break;
            case "cos":
                System.out.println("Resultado: " + calculator.coseno(a));
                break;
            case "tan":
                System.out.println("Resultado: " + calculator.tangente(a));
                break;
            case "fact":
                System.out.println("Resultado: " + calculator.factorial((int) a));
                break;
            default:
                System.out.println("Operación no válida.");
                break;
        }
        scanner.close();
    }
}