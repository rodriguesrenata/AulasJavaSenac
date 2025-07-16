package aula02;

import java.util.Scanner;

public class MediaEstudante {
    public static void main(String[] args) {

        //Curso Senac Java (notas de 0 a 10, presisa de 7 para passar)

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome da(o) aluna(o): ");
        String nomeAluno = sc.nextLine();

        double nota1 = sc.nextDouble();
        System.out.println("Semestre 1 " +nomeAluno+ " "+nota1);

        double nota2 = sc.nextDouble();
        System.out.println("Semestre 2 "  +nomeAluno+ " "+ nota2);

        double nota3 = sc.nextDouble();
        System.out.println("Semestre 3 " +nomeAluno+ " "+nota3);

        double nota4 = sc.nextDouble();
        System.out.println("Semestre 4 " +nomeAluno+ " "+ nota4);

        double media = (nota1+nota2+nota3+nota4) /4;
        System.out.printf("A média é: %.1f\n", media);
        if (media >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado");

        }
        sc.close();
    }
}