package cts.test2_practice.state.farmacie.classes;

public class Achizitionata implements Stare{
    protected Achizitionata(){

    }

    @Override
    public void seteazaStarea(RetetaM retetaM) {
        retetaM.setStare(this);
    }
}
