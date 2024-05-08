package cts.test_practice.simpleFactory.clase;

public class Raceala extends CategorieMedicament{
    public Raceala(String denumire, double pret) {
        super(denumire, pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.println(this.getPret() + " " + this.getDenumire());
    }
}
