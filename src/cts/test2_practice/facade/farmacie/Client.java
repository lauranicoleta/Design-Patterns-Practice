package cts.test2_practice.facade.farmacie;

public class Client {
    private String nume;
    private boolean cardDeSanatate;

    public Client(String nume, boolean cardDeSanatate) {
        this.nume = nume;
        this.cardDeSanatate = cardDeSanatate;
    }

    public String getNume() {
        return nume;
    }

    public boolean isCardDeSanatate() {
        return cardDeSanatate;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", cardDeSanatate=" + cardDeSanatate +
                '}';
    }
}
