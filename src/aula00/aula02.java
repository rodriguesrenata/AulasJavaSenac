package aula00;

public class aula02 {
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