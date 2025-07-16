package aula00;

public class aula00 {
    public static void main(String[] args) {
        //Declarando e inicializando variáveis
        int idade = 30;
        double preco = 19.99;
        boolean isJavaFun = true;
        String saudacao = "Olá, Programador!";
        char primeiraletra = 'J';
        String nome = "Paulo";

//sout
        System.out.println(idade);
// Imprimindo os valores das variáeis
        System.out.println("Idade" + " " + idade);
        System.out.println("Preço"+ " " + preco);
        System.out.println("Java é divertido" + " " + isJavaFun);
        System.out.println("Primeira letra" + " " + primeiraletra);
        System.out.println("Saudação" + " " + saudacao);
        System.out.println("Meu nome é" + " " + nome + " " + "e tenho" + " " + idade + " " + "anos!");

// Modificando uma variável
        idade = 31;
        System.out.println("Nova idade" + idade);

        System.out.println("Hello World");

    }
}
