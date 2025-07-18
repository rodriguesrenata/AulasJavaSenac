package aula03_1;

public class Main {

    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.cor = "Vermelho";
        meuCarro.modelo = "Civic";
        meuCarro.ano = 2022;

        meuCarro.exibirInformacoes();
        meuCarro.ligar();
        meuCarro.darRe();
        meuCarro.desligar();


        Moto minhaMoto = new Moto();
        minhaMoto.modelo = "Nmax";
        minhaMoto.cor = "Cinza e Preta";
        minhaMoto.ano = 2019;

        minhaMoto.exibirInformacoes();
        minhaMoto.ligar();
        minhaMoto.empinar();
        minhaMoto.desligar();
    }
}