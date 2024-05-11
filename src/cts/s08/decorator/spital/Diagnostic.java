package cts.s08.decorator.spital;

public class Diagnostic implements DiagnosticAbstract{
    private String numeDiagnostic;
    private String simptome;
    private boolean necesitaSpitalizare;

    public Diagnostic(String numeDiagnostic, String simptome, boolean necesitaSpitalizare) {
        this.numeDiagnostic = numeDiagnostic;
        this.simptome = simptome;
        this.necesitaSpitalizare = necesitaSpitalizare;
    }

    @Override
    public void printeazaDiagnostic() {
        System.out.println("Nume diagnostic " + this.numeDiagnostic + " Simptome " + this.simptome +
                (necesitaSpitalizare ? ". Necesita spitalizare" : ". Nu necesita spitalizare"));
    }

    @Override
    public String getNumeDiagnostic() {
        return this.numeDiagnostic;
    }

    @Override
    public String getSimptome() {
        return this.simptome;
    }

    @Override
    public boolean getNecesitaSpecializare() {
        return this.necesitaSpitalizare;
    }
}
