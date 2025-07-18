package aula04;

public class Main {
    public static void main(String[] args) {
        Engenheiro engenheiro = new Engenheiro();
        Arquiteto arquiteto = new Arquiteto();

        engenheiro.registrarNoCrea();
        engenheiro.supervisionarCalculo();

        arquiteto.registrarNoCrea();
        arquiteto.supervisionarProjeto();
    }
}
