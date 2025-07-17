package aula03_1;

public class Main {

    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.cor = "Vermelho";
        meuCarro.modelo = "Civic";
        meuCarro.ano = 2022;

        meuCarro.ligar();
        meuCarro.desligar();
        meuCarro.exibirInformacoes();
    }
}