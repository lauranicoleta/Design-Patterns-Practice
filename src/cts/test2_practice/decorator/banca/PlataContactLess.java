package cts.test2_practice.decorator.banca;

public class PlataContactLess extends Decorator{

    public PlataContactLess(PlataCard plata) {
        super(plata);
    }

    @Override
    public void plataContactLess() {
        double suma = ((Plata) plata).getSuma();
        System.out.println("Ati realizat o plata contactLess in valoare de " + suma);
    }

    @Override
    public void plataNormala() {
        super.plataNormala();
    }

    @Override
    public void plataOnline() {
        super.plataOnline();
    }
}
