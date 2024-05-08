package cts.s11.state.main;
import cts.s11.state.classes.Pacient;

public class Main {
    public static void main(String[] args){
       Pacient pacient = new Pacient("Gheorghita");

       pacient.seAgraveazaStarea();
       pacient.vindecare();
       pacient.seImbunatatesteStarea();;
       pacient.vindecare();

       Pacient pacient1 = new Pacient("Ionela");
       pacient1.seAgraveazaStarea();
       pacient1.seImbunatatesteStarea();
       pacient1.vindecare();
    }
}
