package cts.test2_practice.adapter.STB;

public class Main {
    public static void main(String[] args){
        BiletTerestru biletTerestru = new BiletT("terestru");
        BiletSubteran biletSubteran = new BiletSubteran("subteran");
        AdapterBiletTerestruLaSubteran adapterBiletTerestruLaSubteran = new AdapterBiletTerestruLaSubteran(biletSubteran);
        adapterBiletTerestruLaSubteran.valideazaBilet();
        adapterBiletTerestruLaSubteran.valideazaAbonament();
    }
}
