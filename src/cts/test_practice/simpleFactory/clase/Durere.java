package cts.test_practice.simpleFactory.clase;

public class Durere extends CategorieMedicament{
    public Durere(String denumire, double pret) {
        super(denumire, pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.println(this.getDenumire() + " " + this.getPret());
    }
}
