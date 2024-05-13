package cts.s10.observer.classes;

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
    public void eliminaAbonat(Observer observer){
        if(observerList.contains(observer)){
            observerList.remove(observer);
        }
    }
    public void notificaAbonati(String mesaj){
        for (Observer o : observerList){
            o.primesteNotificarea(mesaj);
        }
    }

    public abstract void notificaMeciFotbal();
    public abstract void notificaMeciHandbal();
    public abstract void notificaMeciVolei();
}
