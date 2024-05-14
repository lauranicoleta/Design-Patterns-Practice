package cts.test2_practice.composite.STB;

public class Main {
    public static void main(String[] args){
        StructuraAbstracta grup1 = new Grup("G1");
        StructuraAbstracta grup2 = new Grup("G2");

        StructuraAbstracta loc1 = new Loc("loc",1);
        StructuraAbstracta loc2 = new Loc("loc",1);
        StructuraAbstracta loc3 = new Loc("loc",1);
        StructuraAbstracta loc4 = new Loc("loc",1);

        grup1.adaugaStructura(loc1);
        grup1.adaugaStructura(loc2);
        grup1.adaugaStructura(loc3);
        grup2.adaugaStructura(loc4);

        StructuraAbstracta flota = new Grup("Flota");
        flota.adaugaStructura(grup1);
        flota.adaugaStructura(grup2);
        Autobuz autobuz = new Autobuz("Renault", "An 2015", (Grup) flota);
        autobuz.afiseazaFlota();
    }
}
