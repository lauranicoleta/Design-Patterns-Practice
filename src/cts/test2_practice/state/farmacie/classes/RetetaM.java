package cts.test2_practice.state.farmacie.classes;

public class RetetaM {
    private int nrReteta;
    private Stare stare;

    public RetetaM(int nrReteta) {
        this.nrReteta = nrReteta;
        this.stare = new Emisa();
    }

    public int getNrReteta() {
        return nrReteta;
    }

    public void setNrReteta(int nrReteta) {
        this.nrReteta = nrReteta;
    }

    public Stare getStare() {
        return stare;
    }

    protected void setStare(Stare stare) {
        this.stare = stare;
    }
    public void cereDeLaFarmacie(){
        if(this.stare instanceof Emisa){
            Stare solicitata = new Solicitata();
            solicitata.seteazaStarea(this);
            System.out.println("Reteta a fost solicitata!");
        }else {
            System.out.println("Reteta nu poate fi solicitata deoarece nu a fost emisa sau a fost deja solicitata!");
        }
    }

    public void seRealizeazaAchizitia(){
        if(this.stare instanceof Solicitata){
            Stare achizitionata = new Achizitionata();
            achizitionata.seteazaStarea(this);
            System.out.println("Reteta a fost achizitionata!");
        }else{
            System.out.println("Reteta nu poate fi achizitionata deoarece nu a fost solicitata!");
        }
    }

}
