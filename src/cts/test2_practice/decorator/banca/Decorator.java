package cts.test2_practice.decorator.banca;

public abstract class Decorator implements PlataCard{
    protected PlataCard plata;

    public Decorator(PlataCard plata){
        this.plata = plata;
    }

    public abstract void plataContactLess();

    @Override
    public void plataNormala() {
        plata.plataNormala();
    }

    @Override
    public void plataOnline() {
        plata.plataOnline();
    }
}
