package aula02;

import java.util.Scanner; // Importa a classe Scanner para poder ler dados digitados pelo usuário

public class MediaEstudante {
    public static void main(String[] args) {

        //Curso Senac Java (notas de 0 a 10, precisa de 7 para passar)

        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para capturar entradas do teclado

        // Pede o nome da aluna ou aluno
        System.out.print("Digite o nome da(o) aluna(o): ");
        String nomeAluno = sc.nextLine();

        // Pede e lê a nota do semestre
        System.out.print("Digite a nota do Semestre 1: ");
        double nota1 = sc.nextDouble();
        System.out.println("Semestre 1 " +nomeAluno+ " "+nota1);

        System.out.print("Digite a nota do Semestre 2: ");
        double nota2 = sc.nextDouble();
        System.out.println("Semestre 2 "  +nomeAluno+ " "+ nota2);

        System.out.print("Digite a nota do Semestre 3: ");
        double nota3 = sc.nextDouble();
        System.out.println("Semestre 3 " +nomeAluno+ " "+nota3);

        System.out.print("Digite a nota do Semestre 4: ");
        double nota4 = sc.nextDouble();
        System.out.println("Semestre 4 " +nomeAluno+ " "+ nota4);

        // Calcula a média das quatro notas
        double media = (nota1+nota2+nota3+nota4) /4;

        // Exibe a média com uma casa decimal
        System.out.printf("A média é: %.1f\n", media);

        // Verifica se a média é suficiente para aprovação (7 ou mais)
        if (media >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado");

        }
        sc.close(); // Fecha o Scanner
    }
}