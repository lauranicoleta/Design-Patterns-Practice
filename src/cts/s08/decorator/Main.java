package cts.s08.decorator;

import cts.s08.decorator.decorator.AplicatieMobila;
import cts.s08.decorator.decorator.Decorator;
import cts.s08.decorator.decorator.Website;
import cts.s08.decorator.spital.Diagnostic;
import cts.s08.decorator.spital.DiagnosticAbstract;

public class Main {
    public static void main(String[] args){
        DiagnosticAbstract diagnostic = new Diagnostic("raceala", "febra, nas infundat, durere de cap", false);
        diagnostic.printeazaDiagnostic();

        Decorator diagnosticAPM = new AplicatieMobila(diagnostic);
        diagnosticAPM.afiseazaOnline();

        Decorator diagnosticWeb = new Website(diagnostic);
        diagnosticWeb.afiseazaOnline();
    }
}
