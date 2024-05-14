package cts.test2_practice.state.farmacie.classes;

public class Emisa implements Stare{
    protected Emisa(){

    }

    @Override
    public void seteazaStarea(RetetaM retetaM) {
        retetaM.setStare(this);
    }
}
