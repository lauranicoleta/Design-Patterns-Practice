package cts.test2_practice.state.STB;

public class InCapatDeLinie implements State{
    protected InCapatDeLinie() {
    }

    @Override
    public void setareState(Autobuz autobuz) {
        autobuz.setState(this);
    }
}
