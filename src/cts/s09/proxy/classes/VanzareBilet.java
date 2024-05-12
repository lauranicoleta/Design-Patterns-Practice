package cts.s09.proxy.classes;

public class VanzareBilet implements Vanzare{
    private String meci;
    private int pret;

    public VanzareBilet(String meci, int pret) {
        this.meci = meci;
        this.pret = pret;
    }

    @Override
    public void vanzare(Persoana persoana) {
        System.out.println("Biletul a fost vandut persoanei: " + persoana);
    }

    @Override
    public String toString() {
        return  "MECI : " + meci + '\n' +
                "PRET : " + pret;
    }
}
