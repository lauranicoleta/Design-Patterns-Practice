package cts.s11.state.classes;

public class Externat implements Stare{
    @Override
    public void setareStare(Pacient pacient) {
        pacient.setStare(this);
    }
    protected Externat(){

    }
}
