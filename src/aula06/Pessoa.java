package aula06;

public class Pessoa {
    // Atributos privados (ninguém acessa diretamente)
    private String nome;
    private int idade;

    // Getter para o nome
    public String getNome() {
        return nome;
    }

    // Setter para o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para a idade
    public int getIdade() {
        return idade;
    }

    // Setter para a idade
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static void main(String[] args) {
        Pessoa p = new Pessoa();

        p.setNome("Renata"); // usando setter pra colocar o nome
        p.setIdade(38);      // usando setter pra colocar a idade

        System.out.println("Nome: " + p.getNome());  // usando getter pra mostrar
        System.out.println("Idade: " + p.getIdade());
    }
}
