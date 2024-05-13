package cts.test2_practice.state.restaurant;

public class Rezervata implements State{
    protected Rezervata() {
    }

    @Override
    public void seteazaStarea(Masa masa) {
        masa.setState(this);
    }
}
