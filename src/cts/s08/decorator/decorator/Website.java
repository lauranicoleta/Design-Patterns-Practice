package cts.s08.decorator.decorator;

import cts.s08.decorator.spital.DiagnosticAbstract;

public class Website extends Decorator{
    public Website(DiagnosticAbstract diagnostic) {
        super(diagnostic);
    }

    @Override
    public void afiseazaOnline() {
        System.out.println("Pe website online ati primit urmatoarele rezultate:" +
                super.getNumeDiagnostic() + ", " + super.getSimptome()+ super.getNecesitaSpecializare());
    }
}
