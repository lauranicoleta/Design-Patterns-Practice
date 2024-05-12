package cts.test2_practice.proxy.STB;

public class Autobuz implements Oprire{
    private String linie;
    private int nrPersoane;

    public Autobuz(String linie, int nrPersoane) {
        this.linie = linie;
        this.nrPersoane = nrPersoane;
    }

    public String getLinie() {
        return linie;
    }

    public void setLinie(String linie) {
        this.linie = linie;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    @Override
    public void oprire(Autobuz autobuz) {
        System.out.println(this + " s-a oprit in statie.");
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "linie='" + linie + '\'' +
                ", nrPersoane=" + nrPersoane +
                '}';
    }
}
