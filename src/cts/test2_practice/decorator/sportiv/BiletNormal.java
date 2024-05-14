package cts.test2_practice.decorator.sportiv;

public class BiletNormal implements Bilet{
    private String numePersoana;

    public String getNumePersoana() {
        return numePersoana;
    }

    public void setNumePersoana(String numePersoana) {
        this.numePersoana = numePersoana;
    }

    public BiletNormal(String numePersoana) {
        this.numePersoana = numePersoana;
    }

    @Override
    public void printeazaBilet() {
        System.out.println("Biletul pentru persoana " + numePersoana + " a fost printat.");
    }
}
