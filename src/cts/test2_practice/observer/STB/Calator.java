package cts.test2_practice.observer.STB;

public class Calator implements Observer{
    private String nume;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Calator(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteAnunt(String mesaj) {
        System.out.println("Stimata/e " + nume + " ati primit urmatorul mesaj: " + mesaj);
    }
}
