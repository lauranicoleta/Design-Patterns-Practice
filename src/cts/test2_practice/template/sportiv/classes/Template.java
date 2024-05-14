package cts.test2_practice.template.sportiv.classes;

public abstract class Template {
    public void ocupareaLocurilor(){
        seAseazaLaCoada();
        sePrezintaBiletul();
        seIntraPeStadion();
        seOcupaLocul();
    }
    protected abstract void seAseazaLaCoada();
    protected abstract void sePrezintaBiletul();
    protected abstract void seIntraPeStadion();
    protected abstract void seOcupaLocul();
}
