package cts.s11.state.classes;

public class Pacient {
    private String nume;
    private Stare stare;

    public Pacient(String nume){
        this.nume = nume;
        stare = new Internat();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Stare getStare() {
        return stare;
    }

    protected void setStare(Stare stare) {
        this.stare = stare;
    }

    public void seAgraveazaStarea(){
        if(this.stare instanceof  Internat){
            Stare subObservatie = new SubObservatie();
            subObservatie.setareStare(this);
            System.out.println("Starea de sanatate a pacientului " + this.nume + " s-a agravat!");
        }
        else {
            System.out.println("Pacientul  " + this.nume + " nu este internat");
        }
    }

    public void seImbunatatesteStarea(){
        if(this.stare instanceof  SubObservatie){
            Stare internat = new Internat();
            internat.setareStare(this);
            System.out.println("Starea de sanatate a pacientului " + this.nume + " s-a imbunatatit!");
        }else{
            System.out.println("Pacientul " + this.nume + " nu era in stare grava!");
        }
    }

    public void vindecare(){
        if(this.stare instanceof Internat){
            Stare externat = new Externat();
            externat.setareStare(this);
            System.out.println("Pacientul " + this.nume + " a fost externat!");
        }else{
            System.out.println("Pacientul " + this.nume + " nu poate fi externat!");
        }
    }
}
