package aula06;

public class Main {
    public static void main(String[] args) {
        PessoaSeparado p = new PessoaSeparado("Renata", 38, "ID12345");


        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());
        System.out.println("ID: " + p.getID());
    }
}
