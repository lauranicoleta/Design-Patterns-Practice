package cts.test2_practice.composite.restaurant;

public class Main {
    public static void main(String[] args){
        StructuraAbstracta starter = new Sectiune("Starter");
        StructuraAbstracta bauturi = new Sectiune("Bauturi");

        StructuraAbstracta apa = new Sectiune("Apa");
        StructuraAbstracta suc = new Sectiune("Suc");

        StructuraAbstracta apaPlata = new Item("Apa plata");
        StructuraAbstracta apaCArbo = new Item("Apa carbogazificata");

        apa.adaugaStructura(apaPlata);
        apa.adaugaStructura(apaCArbo);

        StructuraAbstracta cola = new Item("Coca Cola");
        StructuraAbstracta fanta = new Item("Fanta");

        suc.adaugaStructura(cola);
        suc.adaugaStructura(fanta);

        bauturi.adaugaStructura(apa);
        bauturi.adaugaStructura(suc);

        StructuraAbstracta meniu = new Sectiune("Meniu");
        meniu.adaugaStructura(starter);
        meniu.adaugaStructura(bauturi);
        meniu.descriere("      ");

    }
}
