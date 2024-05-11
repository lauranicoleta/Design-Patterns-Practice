package cts.s08.composite.main;

import cts.s08.composite.classes.Departament;
import cts.s08.composite.classes.Sectie;
import cts.s08.composite.classes.StructuraAbstracta;

public class Main {
    public static void main(String[] args){
        StructuraAbstracta cardiologie = new Departament("Cardiologie", "Ionita");
        StructuraAbstracta policlinica = new Departament("Policlinica", "Andrei Sali");

        StructuraAbstracta ecografie = new Sectie("Ecografie", 6, "Lorenta");
        policlinica.adaugaStructura(ecografie);
        StructuraAbstracta terapirIntensiva = new Sectie("Terapie Intensiva", 3, "Marian");
        cardiologie.adaugaStructura(terapirIntensiva);

        StructuraAbstracta spital = new Departament("Spital", "Eugen");
        spital.adaugaStructura(cardiologie);
        spital.adaugaStructura(policlinica);

        spital.afiseazaDescriere("     ");
    }
}
