package cts.test2_practice.facade.sportiv;

public class Bilet {
    private String serieBuletinPersoana;
    private String numePersoana;

    @Override
    public String toString() {
        return "Bilet{" +
                "serieBuletinPersoana='" + serieBuletinPersoana + '\'' +
                ", numePersoana='" + numePersoana + '\'' +
                '}';
    }

    public String getSerieBuletinPersoana() {
        return serieBuletinPersoana;
    }

    public void setSerieBuletinPersoana(String serieBuletinPersoana) {
        this.serieBuletinPersoana = serieBuletinPersoana;
    }

    public String getNumePersoana() {
        return numePersoana;
    }

    public void setNumePersoana(String numePersoana) {
        this.numePersoana = numePersoana;
    }

    public Bilet(String serieBuletinPersoana, String numePersoana) {
        this.serieBuletinPersoana = serieBuletinPersoana;
        this.numePersoana = numePersoana;
    }
}
