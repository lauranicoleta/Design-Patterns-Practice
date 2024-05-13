package cts.test2_practice.strategy.banca;

public class Main {
    public static void main(String[] args){
        String persF = "persoana fizica";
        String persJ = "persoana juridica";

        Procesare procesare = new Procesare(new PersoaneFizice());
        procesare.proceseazaDoc(persF);

        procesare.setStrategy(new PersoaneJuridice());
        procesare.proceseazaDoc(persJ);
    }
}
