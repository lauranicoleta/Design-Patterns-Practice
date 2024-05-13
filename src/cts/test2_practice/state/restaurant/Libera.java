package cts.test2_practice.state.restaurant;

public class Libera implements State{
    protected Libera() {
    }

    @Override
    public void seteazaStarea(Masa masa) {
        masa.setState(this);
    }
}
