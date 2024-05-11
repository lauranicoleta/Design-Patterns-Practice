package cts.s08.decorator.decorator;

import cts.s08.decorator.spital.DiagnosticAbstract;

public class AplicatieMobila extends Decorator{

    public AplicatieMobila(DiagnosticAbstract diagnostic) {
        super(diagnostic);
    }

    @Override
    public void afiseazaOnline() {
        System.out.println("In aplicatia mobila ati primit urmatoarele rezultate:" +
                super.getNumeDiagnostic() + ", " + super.getSimptome()+ super.getNecesitaSpecializare());
    }
}
