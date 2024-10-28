package mx.ipn.upiicsa.poo.calcHerencia.Calculator;

public class Calculator {
    //Métodos de la calculadora
    public double suma(double a, double b) {
        return a + b;
    }

    public double resta(double a, double b) {
        return a - b;
    }

    public double multiplicacion(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0;
        }
    }

    public double porcentaje(double a, double b) {
        return (a * b) / 100;
    }
}
