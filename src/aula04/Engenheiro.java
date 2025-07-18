package aula04;

public class Engenheiro implements CREA {
    @Override
    public void registrarNoCrea(){
        System.out.println("Engenheiro registrado no CREA");
    }

    public void supervisionarCalculo() {
        System.out.println("Supervisiona os calculos");
    }
}
