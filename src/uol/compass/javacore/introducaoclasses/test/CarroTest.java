package uol.compass.javacore.introducaoclasses.test;

import uol.compass.javacore.introducaoclasses.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.placa = "3ND-G4M3";
        carro.modelo = "GTR-R34";
        carro.velocidadeMax = 270.00;
        System.out.println(carro.modelo + ", " + carro.placa + ", " + carro.velocidadeMax);
    }
}
