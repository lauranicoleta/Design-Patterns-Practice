package cts.test_practice.factoryMethod;

public class Program {
    public static void prelucrareCategorieMedicament(IFactoryCategorieMedicament factoryCategorieMedicament, String denumire, double pret){
        CatogorieMedicament categorieMedicament = factoryCategorieMedicament.createCategorieMedicament(denumire, pret);
        categorieMedicament.afisareDetalii();
    }
    public static void main(String[] args){
        prelucrareCategorieMedicament(new FActoryDurere(), "nurofen", 25.88);
    }
}
