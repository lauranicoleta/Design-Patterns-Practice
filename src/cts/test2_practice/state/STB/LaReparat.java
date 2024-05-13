package cts.test2_practice.state.STB;

public class LaReparat implements State{
    protected LaReparat() {
    }

    @Override
    public void setareState(Autobuz autobuz) {
        autobuz.setState(this);
    }
}
