package cts.test2_practice.state.restaurant;

public class Ocupata implements State{
    protected Ocupata() {
    }

    @Override
    public void seteazaStarea(Masa masa) {
        masa.setState(this);
    }
}
