package cts.s10.observer.classes;

public class Abonat implements Observer{
    private String nume;

    public Abonat(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificarea(String mesaj) {
        System.out.println(nume + ", ai primit urmatorul mesaj: \n " + mesaj);
    }
}
