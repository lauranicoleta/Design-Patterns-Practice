package cts.test_practice.simpleFactory.clase;

public class Program {
    public static void main(String[] args){
        CateogorieMedicamentFactory cateogorieMedicamentFactory = new CateogorieMedicamentFactory();
        CategorieMedicament body = cateogorieMedicamentFactory.creezaCategorieMedicament(TipMedicament.BODY, "Nivea", 55.00);
        body.afisareDetalii();
    }
}
