package aula02;

public class Matematica {
    public static void main(String[] args) {
        double base = 2;
        double expoente = 3;

        System.out.println("1. Potenciação");
        System.out.println(base + " elevado à " + expoente + " é: " + Math.pow(base, expoente));

        int negativo = -10;
        System.out.println("\n2. Valor absoluto:");
        System.out.println("O valor absoluto de " + negativo + " é: " + Math.abs(negativo));

        int a = 7, b = 15;
        System.out.println("\n3. Maior valor:");
        System.out.println("O maior entre " + a + " e " + b + " é: " + Math.max(a, b));

        System.out.println("\n4. Menor valor:");
        System.out.println("O menor entre " + a + " e " + b + " é: " + Math.min(a, b));

        double valor = 3.5;
        System.out.println("\n5. Arredondamento:");
        System.out.println("Arredondando " + valor + ": " + Math.round(valor));

        System.out.println("\n6. Número aleatório:");
        double aleatorio = Math.random() * 100;
        System.out.println("Número aleatório entre 0 e 100: " + aleatorio + " " + String.format("%.3f", aleatorio));

    }
}
