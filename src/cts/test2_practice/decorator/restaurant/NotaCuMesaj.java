package cts.test2_practice.decorator.restaurant;

public class NotaCuMesaj extends Decorator{
    public NotaCuMesaj(Nota nota) {
        super(nota);
    }

    @Override
    public void printezaCuMesaj() {
        super.printeazaNota();
        System.out.println( "La multi ani!" );
    }
}
