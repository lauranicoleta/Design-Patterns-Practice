package cts.test2_practice.observer.STB;

public class CompaniaSTB extends Subject{
    private String denumire;

    public CompaniaSTB(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void notificaUtilizatoriAutobuzulPleaca() {
        super.notificaUtilizatori("Autobuzul pleaca acum de la capat de linie.");
    }
}
