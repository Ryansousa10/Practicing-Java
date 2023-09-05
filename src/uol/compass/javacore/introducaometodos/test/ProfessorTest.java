package uol.compass.javacore.introducaometodos.test;

import uol.compass.javacore.introducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.cpf = "111.111.111-11";
        prof.nome = "Ryan de Sousa Silva";
        prof.rg = "11111111-1";
        prof.matricula = "123ADS456";
        Professor prof2 = new Professor();
        prof2.cpf = "222.222.222-22";
        prof2.nome = "Silva Sousa Ryan ";
        prof2.rg = "22222222-2";
        prof2.matricula = "123ADS456";

        prof.imprime();
        prof2.imprime();
    }
}
