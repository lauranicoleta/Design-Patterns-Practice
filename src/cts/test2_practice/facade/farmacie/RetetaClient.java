package cts.test2_practice.facade.farmacie;

public class RetetaClient {
    private int nrMedicamenteSolicitate;

    public RetetaClient(int nrMedicamenteSolicitate) {
        this.nrMedicamenteSolicitate = nrMedicamenteSolicitate;
    }

    public int getNrMedicamenteSolicitate() {
        return nrMedicamenteSolicitate;
    }
    public boolean verificareAsigurare(Client client) {
        return client.isCardDeSanatate();
    }
}
