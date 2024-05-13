package cts.test2_practice.observer.banca;

public class Abonat implements Observer{
    private String nume;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotficare(String mesaj) {
        System.out.println("Stimate, " + nume + " ati primit urmatorul mesaj: \n" + mesaj);
    }

    public Abonat(String nume) {
        this.nume = nume;
    }
}
