package cts.s11.template.classes;

public abstract class Template {
    public final void internare(Pacient pacient){
        analizaSanatate(pacient);
        if(disponibilitatePaturi() > 0){
            emitereFisa(pacient);
        }else {
            refuzaInternare(pacient);
        }
    }

    //se foloseste protected pentru a nu putea fi apelate in main sau extern
    protected abstract void analizaSanatate(Pacient pacient);
    protected abstract int disponibilitatePaturi();
    protected abstract void emitereFisa(Pacient pacient);
    protected abstract void refuzaInternare(Pacient pacient);
}
