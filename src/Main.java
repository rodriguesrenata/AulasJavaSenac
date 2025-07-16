//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }

    public static class aula00 {
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

    public static class aula02 {
        public static void main(String[] args) {

            int a = 10;
            int b = 5;
            //sout
            //Aritméticos
            System.out.println("a + b " + (a+b)); // 15
            System.out.println("a - b " + (a-b)); // 5
            System.out.println("a * b " + (a*b)); // 15
            System.out.println("a / b " + (a/b)); // 15
            System.out.println("a % b " + (a%b)); // 15


            //comparação
            System.out.println("a > b " + (a > b)); // true
            System.out.println("a == b " + (a == b)); // false

            //logicos
            boolean condicao1 = (a > 8);
            boolean condicao2 = (b < 3);
            System.out.println("Condição1 && Condição2" + (condicao1 && condicao2)); // true
            System.out.println("Condição1 || Condição2" + (condicao1 || condicao2)); // true
            System.out.println("Condição1" + (condicao1)); // true

        }
    }
}