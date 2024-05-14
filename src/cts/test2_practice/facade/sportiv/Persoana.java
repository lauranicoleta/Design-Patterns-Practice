package cts.test2_practice.facade.sportiv;

public class Persoana {
    private String nume;
    private String serieBuletin;

    public Persoana(String nume, String serieBuletin) {
        this.nume = nume;
        this.serieBuletin = serieBuletin;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", serieBuletin='" + serieBuletin + '\'' +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getSerieBuletin() {
        return serieBuletin;
    }

    public void setSerieBuletin(String serieBuletin) {
        this.serieBuletin = serieBuletin;
    }
}
