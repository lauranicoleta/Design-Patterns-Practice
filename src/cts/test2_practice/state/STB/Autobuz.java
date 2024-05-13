package cts.test2_practice.state.STB;

public class Autobuz {
    private String linie;
    private State state;
    public Autobuz(String linie) {
        this.linie = linie;
        this.state = new InCapatDeLinie();
    }

    public String getLinie() {
        return linie;
    }

    public void setLinie(String linie) {
        this.linie = linie;
    }

    public State getState() {
        return state;
    }

    protected void setState(State state) {
        this.state = state;
    }
    public void pleacaInCursa(){
        if(this.state instanceof InCapatDeLinie){
            State inCursa = new InCursa();
            inCursa.setareState(this);
            System.out.println("Autobuzul care circula pe linia " + this.linie +" a plecat in cursa.");
        }else {
            System.out.println("Autobuzul care circula pe linia " + this.linie +" nu poate pleca in cursa.");
        }
    }

    public void laCapatDeLinie(){
        if(this.state instanceof InCursa){
            State inCapatDeLinie = new InCapatDeLinie();
            inCapatDeLinie.setareState(this);
            System.out.println("Autobuzul care circula pe linia " + this.linie +" a ajuns la capatul liniei.");
        }else{
            System.out.println("Autobuzul care circula pe linia " + this.linie +" este plecat in cursa.");
        }
    }
    public void esteLaReparat(){
        State esteLaReparat = new LaReparat();
        esteLaReparat.setareState(this);
    }
    public void aIesitDeLaReparat(){
        if(this.state instanceof LaReparat){
            State inCursa = new InCursa();
            inCursa.setareState(this);
            System.out.println("Autobuzul care circula pe linia " + this.linie +" a fost reparat si a plecat in cursa.");
        }
        else{
            System.out.println("Autobuzul care circula pe linia " + this.linie +" nu este la reparat.");
        }
    }
}
