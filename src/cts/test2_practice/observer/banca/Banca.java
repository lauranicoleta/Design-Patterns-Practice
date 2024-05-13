package cts.test2_practice.observer.banca;

public class Banca extends Subject{
    @Override
    public void notificaNoiOferte() {
        super.notificaAbonati("Aveti noi oferte disponibile in aplicatie.");
    }

    @Override
    public void notificaFonduriinsuficiente() {
        super.notificaAbonati("Ne pare rau, dar nu aveti fonduri suficiente pentru aceasta plata.");
    }
}
