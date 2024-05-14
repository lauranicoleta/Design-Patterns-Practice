package cts.test2_practice.adapter.STB;

public class AdapterBiletTerestruLaSubteran implements BiletTerestru{
    private BiletSubteran biletSubteran;

    public AdapterBiletTerestruLaSubteran(BiletSubteran biletSubteran) {
        this.biletSubteran = biletSubteran;
    }

    @Override
    public void valideazaBilet() {
        System.out.println("A fost validat biletul " + biletSubteran.getDenumire());
    }

    @Override
    public void valideazaAbonament() {
        System.out.println("A fost validat abonamentul " + biletSubteran.getDenumire());
    }
}
