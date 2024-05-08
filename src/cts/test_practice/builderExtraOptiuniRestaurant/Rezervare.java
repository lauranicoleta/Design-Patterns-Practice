package cts.test_practice.builderExtraOptiuniRestaurant;

public class Rezervare {

    private boolean asezareLaGeam;
    private boolean scauneErgonomice;
    private boolean decorareaMesei;


    public Rezervare(boolean asezareLaGeam, boolean scauneErgonomice, boolean decorareaMesei) {
        this.asezareLaGeam = asezareLaGeam;
        this.scauneErgonomice = scauneErgonomice;
        this.decorareaMesei = decorareaMesei;
    }

    public boolean isAsezareLaGeam() {
        return asezareLaGeam;
    }

    protected void setAsezareLaGeam(boolean asezareLaGeam) {
        this.asezareLaGeam = asezareLaGeam;
    }

    public boolean isScauneErgonomice() {
        return scauneErgonomice;
    }

    protected void setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
    }

    public boolean isDecorareaMesei() {
        return decorareaMesei;
    }

    protected void setDecorareaMesei(boolean decorareaMesei) {
        this.decorareaMesei = decorareaMesei;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "asezareLaGeam=" + asezareLaGeam +
                ", scauneErgonomice=" + scauneErgonomice +
                ", decorareaMesei=" + decorareaMesei +
                '}';
    }
}
