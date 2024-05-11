package cts.s07.adapter.classes.softNou;

public class Bautura {
    private String denumire;
    private float pret;
    private float gradDeAlcool;

    public Bautura(String denumire, float pret, float gradDeAlcool) {
        this.denumire = denumire;
        this.pret = pret;
        this.gradDeAlcool = gradDeAlcool;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public float getGradDeAlcool() {
        return gradDeAlcool;
    }

    public void setGradDeAlcool(float gradDeAlcool) {
        this.gradDeAlcool = gradDeAlcool;
    }

    @Override
    public String toString() {
        return "Bautura{" +
                "denumire='" + denumire + '\'' +
                ", pret=" + pret +
                ", gradDeAlcool=" + gradDeAlcool +
                '}';
    }
}
