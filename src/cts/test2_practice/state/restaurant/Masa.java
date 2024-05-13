package cts.test2_practice.state.restaurant;

public class Masa {
    private int nrMasa;
    private State state;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
        this.state = new Libera();
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public void setNrMasa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public State getState() {
        return state;
    }

    protected void setState(State state) {
        this.state = state;
    }
    public void rezervaMasa(){
        if (this.state instanceof Libera){
            State rezervata = new Rezervata();
            rezervata.seteazaStarea(this);
            System.out.println("Masa " + this.nrMasa + " a fost rezervata cu succes!");
        }else {
            System.out.println("Masa " + this.nrMasa + " nu poate fi rezervata.");
        }
    }

    public void ridicaRezervarea(){
        if(this.state instanceof Rezervata){
            State ocupata = new Ocupata();
            ocupata.seteazaStarea(this);
            System.out.println("Masa " + this.nrMasa + " a fost ocupata cu succes!");
        }else {
            System.out.println("Masa " + this.nrMasa + " nu poate fi ocupata.");
        }
    }

    public void pleacaDeLaMasa(){
        if(this.state instanceof Ocupata){
            State libera = new Libera();
            libera.seteazaStarea(this);
            System.out.println("Masa " + this.nrMasa + " a fost eliberata!");
        }else{
            System.out.println("Masa " + this.nrMasa + " nu este ocupata!");
        }
    }

}
