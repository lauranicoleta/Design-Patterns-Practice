package cts.s07.adapter.classes.softVechi;

import java.util.ArrayList;
import java.util.List;

public class Bucatarie implements SoftBucatarie{
    private List<Produs> produse;
    public Bucatarie(){
        produse = new ArrayList<>();
    }

    public Bucatarie(List<Produs> produse) {
        this.produse = produse;
    }

    @Override
    public void adaugareProdus(Produs produs) {
        this.produse.add(produs);
    }

    @Override
    public void printareBon() {
        float sumaTotala = 0;
        System.out.println("Lista de produse este: \n");
        for(Produs p : produse){
            System.out.println(p);
            sumaTotala += p.getPret();
        }
        System.out.println("Total: " + sumaTotala +"\n");
    }
}
