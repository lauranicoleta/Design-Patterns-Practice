package cts.s08.decorator.decorator;

import cts.s08.decorator.spital.Diagnostic;
import cts.s08.decorator.spital.DiagnosticAbstract;

public abstract class Decorator implements DiagnosticAbstract {
    protected DiagnosticAbstract diagnostic;
    public Decorator(DiagnosticAbstract diagnostic){
        this.diagnostic = diagnostic;
    }

    public abstract void afiseazaOnline();
    @Override
    public void printeazaDiagnostic() {
        diagnostic.printeazaDiagnostic();
        System.out.println("Raportul este disponibil si pe platforma");
    }

    @Override
    public String getNumeDiagnostic() {
        return diagnostic.getNumeDiagnostic();
    }

    @Override
    public String getSimptome() {
        return diagnostic.getSimptome();
    }

    @Override
    public boolean getNecesitaSpecializare() {
        return diagnostic.getNecesitaSpecializare();
    }
}
