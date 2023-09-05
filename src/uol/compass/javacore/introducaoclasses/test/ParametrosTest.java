package uol.compass.javacore.introducaoclasses.test;

import uol.compass.javacore.introducaometodos.classes.Calculadora;

public class ParametrosTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int num1 = 5;
        int num2 = 10;
        calc.alteraDoisParametros(num1, num2);
        System.out.println("num 1: " + num1 + " num 2: " + num2);
    }
}
