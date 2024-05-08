package cts.test_practice.simpleFactory.clase;

public class CateogorieMedicamentFactory {

    public CategorieMedicament creezaCategorieMedicament(TipMedicament tipMedicament, String denumire, double pret){
        switch (tipMedicament){
            case BODY:
                Body body = new Body(denumire, pret);
                return body;
            case DURERE:
                Durere durere = new Durere(denumire, pret);
                return durere;
            case RACEALA:
                Raceala raceala = new Raceala(denumire, pret);
                return raceala;
        }
        return null;
    }

}
