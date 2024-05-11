package cts.s07.adapter.main;

import cts.s07.adapter.classes.softNou.Bautura;
import cts.s07.adapter.classes.softVechi.*;

public class Main {
    public static void platesteComanda(SoftBucatarie comanda){
        comanda.printareBon();
    }
    public static void main(String[] args){
        SoftBucatarie bucatarie = new Bucatarie();
        bucatarie.adaugareProdus(new Produs("Cartofi prajiti", 15));
        bucatarie.adaugareProdus(new Produs("Pizza", 30));
        platesteComanda(bucatarie);

        //Adapterul Comana bar bucatarie este si bar si bucatarie
        AdaugaComandaBarBucatarie bar = new AdaugaComandaBarBucatarie();
        bar.adaugaBautura(new Bautura("Fanta", 7, 0));
        bar.adaugaBautura(new Bautura("Pepsi", 5, 0));
        bar.adaugareProdus(new AdapterBauturaProdus(new Bautura("Apa", 2, 0)));
        platesteComanda(bar);
    }
}
