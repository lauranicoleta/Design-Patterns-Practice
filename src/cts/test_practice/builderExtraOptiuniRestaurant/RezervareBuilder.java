package cts.test_practice.builderExtraOptiuniRestaurant;

public class RezervareBuilder implements Buider{

    Rezervare rezervare;

    public RezervareBuilder() {
        rezervare = new Rezervare(false,false, false);
    }

    public RezervareBuilder setAsezareLaGeam(boolean asezareLaGeam){
        rezervare.setAsezareLaGeam(asezareLaGeam);
        return this;
    }

    public RezervareBuilder setScauneArgonomice(boolean scauneArgonomice){
        rezervare.setScauneErgonomice(scauneArgonomice);
        return this;
    }
    public RezervareBuilder setDecorareaMesei(boolean decorareaMesei){
        rezervare.setDecorareaMesei(decorareaMesei);
        return this;
    }

    @Override
    public Rezervare buid() {
        return rezervare;
    }
}
