package aula04;

public class Arquiteto implements CREA {
    @Override
    public void registrarNoCrea() {
        System.out.println("Arquiteto registrado no CREA.");
    }

    public void supervisionarProjeto() {
        System.out.println("Arquiteto supervisiona projeto.");
    }
}
