package uol.compass.javacore.introducaomodacesso.classes;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Nome inválido");
        }
    }

    public void setIdade(int idade) {
        if (idade < 0 || idade > 150) {
            throw new IllegalArgumentException("Idade inválida");
        }
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }


}

