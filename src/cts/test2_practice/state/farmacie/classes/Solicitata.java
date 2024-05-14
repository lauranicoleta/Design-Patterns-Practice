package cts.test2_practice.state.farmacie.classes;

public class Solicitata implements Stare{
    protected Solicitata(){

    }

    @Override
    public void seteazaStarea(RetetaM retetaM) {
        retetaM.setStare(this);
    }
}
