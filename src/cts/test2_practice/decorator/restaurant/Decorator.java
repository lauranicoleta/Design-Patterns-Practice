package cts.test2_practice.decorator.restaurant;

public abstract class Decorator implements Nota {
    protected Nota notaDePlata;
    public Decorator(Nota nota){
        this.notaDePlata = nota;
    }
    public abstract void printezaCuMesaj();

    @Override
    public void printeazaNota() {
        notaDePlata.printeazaNota();
    }
}
