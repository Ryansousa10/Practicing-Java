package uol.compass.javacore.introducaometodos.test;

import uol.compass.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subDoisNumeros();
        calc.multDoisNumeros(10, 2);
        double result = calc.divDoisNumeros(35, 5);
        System.out.println(result);
    }
}
