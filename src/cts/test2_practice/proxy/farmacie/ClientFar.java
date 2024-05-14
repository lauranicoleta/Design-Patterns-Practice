package cts.test2_practice.proxy.farmacie;

public class ClientFar {
    private String denumire;
    private boolean areRetata;

    @Override
    public String toString() {
        return "ClientFar{" +
                "denumire='" + denumire + '\'' +
                ", areRetata=" + areRetata +
                '}';
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public boolean isAreRetata() {
        return areRetata;
    }

    public void setAreRetata(boolean areRetata) {
        this.areRetata = areRetata;
    }

    public ClientFar(String denumire, boolean areRetata) {
        this.denumire = denumire;
        this.areRetata = areRetata;
    }
}
