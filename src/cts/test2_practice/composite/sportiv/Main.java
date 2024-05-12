package cts.test2_practice.composite.sportiv;

public class Main {
    /*Managerul stadionului dorește organizarea locurilor pe care stau spectatorii într-o structura
    arborescenta. Astfel locurile vor fi organizate in cadrul aplicației pe secțiuni (Tribuna, Peluza, etc)
    Fiecare secțiune conține subsecțiuni (Tribuna Nord, Tribuna Sud, Tribuna Copii, VIP, etc) sau
    direct locurile din acea secțiune. Sa se realizeze modulul care permite reprezentarea arborescenta
    a locurilor spectatorilor in cadrul aplicației.*/

    public static void main(String[] args){
        StructuraAbstracta tribuna = new Sectiune("tribuna");
        StructuraAbstracta peluza = new Sectiune("peluza");

        StructuraAbstracta peluzaSud = new Sectiune("Peluza Sud");
        StructuraAbstracta peluzaNord = new Sectiune("Peluza Nord");
        peluza.adaugaStructura(peluzaSud);
        peluza.adaugaStructura(peluzaNord);

        StructuraAbstracta tribuna1 = new Sectiune("tribuna 1");
        StructuraAbstracta tribuna2 = new Sectiune("tribuna 2");
        tribuna.adaugaStructura(tribuna1);
        tribuna.adaugaStructura(tribuna2);

        StructuraAbstracta loc1 = new Loc("l", 1);
        StructuraAbstracta loc2 = new Loc("l", 2);
        StructuraAbstracta loc3 = new Loc("l", 3);

        tribuna1.adaugaStructura(loc1);
        tribuna1.adaugaStructura(loc2);
        tribuna1.adaugaStructura(loc3);

        StructuraAbstracta stadion = new Sectiune("Stadionul Steaua");
        stadion.adaugaStructura(tribuna);
        stadion.adaugaStructura(peluza);
        stadion.afiseazaDescrierea("      ");

        tribuna1.stergeStructura(loc2);
        stadion.afiseazaDescrierea("     ");
    }
}
