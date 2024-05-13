package cts.s10.observer.classes;

public class Sala extends Subject{
    @Override
    public void notificaMeciFotbal() {
        super.notificaAbonati("Azi va avea loc un meci de fotbal la sala.");
    }

    @Override
    public void notificaMeciHandbal() {
        super.notificaAbonati("Azi va avea loc un meci de handbal la sala.");
    }

    @Override
    public void notificaMeciVolei() {
        super.notificaAbonati("Azi va avea loc un meci de volei la sala.");
    }
}
