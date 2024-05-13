package cts.test2_practice.template.farmacie.classes;

public class Farmacie extends Template{
    private int stocDispobibil;
    private double sumaCasa;

    public Farmacie(int stocDispobibil, double sumaCasa) {
        this.stocDispobibil = stocDispobibil;
        this.sumaCasa = sumaCasa;
    }

    @Override
    protected boolean verificaStocDisponibil(Reteta reteta) {
        if(stocDispobibil >= reteta.getNrMedicamenteCerute()){
            return true;
        }else {
            return false;
        }
    }

    @Override
    protected void incaseazaBanii() {
        System.out.println("Banii pentru reteta au fost incasati!");
    }

    @Override
    protected void scadeStoc(Reteta reteta) {
        stocDispobibil -= reteta.getNrMedicamenteCerute() * 5;
    }

    @Override
    protected void emiteBon(Reteta reteta) {
        System.out.println("Afisare bon fiscal pentru reteta " + reteta);
    }

    @Override
    protected void refuzaAchizitia(Reteta reteta) {
        System.out.println("Stocul disponibil este mai mic decat " + reteta.getNrMedicamenteCerute());
    }
}
