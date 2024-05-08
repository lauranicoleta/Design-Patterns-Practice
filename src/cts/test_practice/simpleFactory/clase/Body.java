package cts.test_practice.simpleFactory.clase;

public class Body extends CategorieMedicament{

    public Body(String denumire, double pret) {
        super(denumire, pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.println(this.getDenumire() + " " + this.getPret());
    }
}
