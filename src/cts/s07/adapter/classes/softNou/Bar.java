package cts.s07.adapter.classes.softNou;

import java.util.ArrayList;
import java.util.List;

public class Bar {
    private List<Bautura> bauturi;

    public Bar(){
        bauturi = new ArrayList<>();
    }
    public Bar(List<Bautura> bauturi) {
        this.bauturi = bauturi;
    }
    public void adaugaBautura(Bautura bautura){
        bauturi.add(bautura);
    }
    public void tiparesteNota(){
        float total = 0;
        System.out.println("Lista de bauturi: \n");
        for (Bautura bautura : bauturi){
            System.out.println(bautura);
            total += bautura.getPret();
        }
        System.out.println("Total: " + total + " \n");
    }
}
