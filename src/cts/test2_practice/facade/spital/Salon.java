package cts.test2_practice.facade.spital;

public class Salon {
    private int nrSalon;
    private int locuriLibere;

    public Salon(int nrSalon, int locuriLibere) {
        this.nrSalon = nrSalon;
        this.locuriLibere = locuriLibere;
    }

    public int getNrSalon() {
        return nrSalon;
    }

    public void setNrSalon(int nrSalon) {
        this.nrSalon = nrSalon;
    }

    public int getLocuriLibere() {
        return locuriLibere;
    }

    public void setLocuriLibere(int locuriLibere) {
        this.locuriLibere = locuriLibere;
    }

    @Override
    public String toString() {
        return "Salon{" +
                "nrSalon=" + nrSalon +
                ", locuriLibere=" + locuriLibere +
                '}';
    }
}
