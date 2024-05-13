package cts.test2_practice.observer.banca;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observerList;
    public Subject(){
        observerList = new ArrayList<>();
    }
    public void adaugaAbonat(Observer observer){
        if(!observerList.contains(observer)){
            observerList.add(observer);
        }
    }
    public void stergeAbonat(Observer observer){
        if(observerList.contains(observer)){
            observerList.remove(observer);
        }
    }
    public void notificaAbonati(String mesaj){
        for (Observer o: observerList){
            o.primesteNotficare(mesaj);
        }
    }

    public abstract void notificaNoiOferte();
    public abstract void notificaFonduriinsuficiente();
}
