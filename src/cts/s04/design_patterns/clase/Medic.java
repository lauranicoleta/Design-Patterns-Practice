package cts.s04.design_patterns.clase;

public class Medic extends PersonalSpital{
    public Medic(String nume, int salariu){
        super(nume, salariu);
    }
    @Override
    public void afisareDetalii() {
        System.out.println("Medicul " + getNume()+ " are salariu de " + getSalariu() + "." );
    }
}
