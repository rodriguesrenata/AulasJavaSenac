package aula03_1;

public class Veiculo {
    //atribuindo classes Veículo
   String cor;
  String modelo;
 int ano;

//Metodo de classes Veículo
  void ligar() {
   System.out.println("O carro " + modelo + " está ligado.");
  }
    void desligar() {
      System.out.println("O carro " + modelo + " foi desligado.");
}

    void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
    }
}