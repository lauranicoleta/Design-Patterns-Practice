package cts.test2_practice.facade.sportiv;

import java.util.ArrayList;
import java.util.List;

public class VerificarePersoana {
    public void verificarePersoana(Persoana persoana){
        List<String> pers = new ArrayList<>();
        pers.add("1"); pers.add("2"); pers.add("3");
        PersoaneCautateDePolitie persoaneCautateDePolitie = new PersoaneCautateDePolitie(pers);
        Bilet bilet = new Bilet("4", "Maria");

        if(persoana.getNume() == bilet.getNumePersoana()) {
            if (!persoaneCautateDePolitie.persoanaEsteCautata(persoana.getSerieBuletin())) {
                System.out.println("Persoana poate intra linistita!");
            } else {
                System.out.println("Persoana este cautata de politie!");
            }
        }else {
            System.out.println("Biletul nu corespunde.");
        }
    }
}
