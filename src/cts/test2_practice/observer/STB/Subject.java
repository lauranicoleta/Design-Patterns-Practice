package cts.test2_practice.observer.STB;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> utilizatoriAplicatie;
    public Subject(){
        utilizatoriAplicatie = new ArrayList<>();
    }
    public void adaugaUtilizator(Observer o){
        if(!utilizatoriAplicatie.contains(o)){
            utilizatoriAplicatie.add(o);
        }
    }
    public void stergeUtilizator(Observer o){
        if(utilizatoriAplicatie.contains(o)){
            utilizatoriAplicatie.remove(o);
        }
    }
    public void notificaUtilizatori(String mesaj){
        for (Observer o : utilizatoriAplicatie){
            o.primesteAnunt(mesaj);
        }
    }
    public abstract void notificaUtilizatoriAutobuzulPleaca();
}
