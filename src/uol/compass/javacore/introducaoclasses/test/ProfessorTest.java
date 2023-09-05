package uol.compass.javacore.introducaoclasses.test;

import uol.compass.javacore.introducaoclasses.classes.ProfessorExercise;

public class ProfessorTest {

    public static void main(String[] args) {

        ProfessorExercise professor = new ProfessorExercise();

        professor.nome = "Ryan";
        professor.matricula = "123ADS456";
        professor.rg = "11111111-1";
        professor.cpf = "111.111.111-11";

        System.out.println("Nome: " + professor.nome);
        System.out.println("Matrícula: " + professor.matricula);
        System.out.println("RG: " + professor.rg);
        System.out.println("CPF: " + professor.cpf);


    }


}
