package cts.test2_practice.state.STB;

public class InCursa implements State{
    protected InCursa() {
    }
    @Override
    public void setareState(Autobuz autobuz) {
        autobuz.setState(this);
    }
}
