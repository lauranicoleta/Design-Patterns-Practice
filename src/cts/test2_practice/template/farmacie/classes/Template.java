package cts.test2_practice.template.farmacie.classes;

public abstract class Template {
    public final void achizitie(Reteta reteta){
        if(verificaStocDisponibil(reteta) == true){
            incaseazaBanii();
            scadeStoc(reteta);
            emiteBon(reteta);
        }else {
            refuzaAchizitia(reteta);
        }
    }
    protected abstract boolean verificaStocDisponibil(Reteta reteta);
    protected abstract void incaseazaBanii();
    protected abstract void scadeStoc(Reteta reteta);
    protected abstract void emiteBon(Reteta reteta);
    protected abstract void refuzaAchizitia(Reteta reteta);

}
