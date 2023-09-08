package uol.compass.javacore.exercises.test;

import uol.compass.javacore.exercises.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante aluno = new Estudante();
        aluno.nome = "Ryan de Sousa Silva";
        aluno.idade = 22;
        aluno.notas = new double[]{10.0, 8.7, 5.4};

        aluno.calcMedia();
    }
}
