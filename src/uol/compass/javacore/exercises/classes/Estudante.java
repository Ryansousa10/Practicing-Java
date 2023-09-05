package uol.compass.javacore.exercises.classes;

import java.text.DecimalFormat;

public class Estudante {

    public String nome;
    public int idade;
    public double[] notas = {0, 0, 0};
    public double soma = 0.0;


    public void calcMedia() {
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        double media = soma / notas.length;

        DecimalFormat formato = new DecimalFormat("##.##");
        String mediaFormatada = formato.format(media);

        System.out.println("Aluno: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Média: " + mediaFormatada);
    }

}
