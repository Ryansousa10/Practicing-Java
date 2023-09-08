package uol.compass.javacore.introducaomodacesso.test;

import uol.compass.javacore.introducaomodacesso.classes.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        try {
            Pessoa pessoa = new Pessoa("Ryan de Sousa Silva", 29);
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
