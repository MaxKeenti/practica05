package mx.ipn.upiicsa.poo.calcHerencia.Calculator;

public class ScientificCalculator extends Calculator {
    // Métodos ya implementados
    public double piso(double a) {
        return Math.floor(a);
    }

    public double techo(double a) {
        return Math.ceil(a);
    }

    public double redondeo(double a) {
        return Math.round(a);
    }

    // Nueva implementación
    public double potenciaCuadrado(double a) {
        return Math.pow(a, 2);
    }

    public double potenciaCubo(double a) {
        return Math.pow(a, 3);
    }

    public double potenciaN(double a, double n) {
        return Math.pow(a, n);
    }

    public double raizCuadrada(double a) {
        return Math.sqrt(a);
    }

    public double raizCubica(double a) {
        return Math.cbrt(a);
    }

    public double raizN(double a, double n) {
        return Math.pow(a, 1.0 / n);
    }

    public double seno(double a) {
        return Math.sin(Math.toRadians(a));
    }

    public double coseno(double a) {
        return Math.cos(Math.toRadians(a));
    }

    public double tangente(double a) {
        return Math.tan(Math.toRadians(a));
    }

    public double factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número debe ser no negativo");
        }
        double resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}