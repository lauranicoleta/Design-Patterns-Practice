package cts.test2_practice.adapter.STB;

public class BiletT implements BiletTerestru{
    private String denumire;

    public BiletT(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void valideazaBilet() {
        System.out.println("A fost validat biletul " + denumire);
    }

    @Override
    public void valideazaAbonament() {
        System.out.println("A fost validat abonamentul " + denumire);
    }
}
