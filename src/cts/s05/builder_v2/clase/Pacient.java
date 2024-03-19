package cts.s05.builder_v2.clase;

public class Pacient implements Builder {
    private boolean patRabatabil;
    private boolean micDeJun;
    private  boolean papuciDeCamera;
    private boolean halatDeBaie;

    public void PacientBuilder() {
        this.patRabatabil = false;
        this.micDeJun = false;
        this.papuciDeCamera = false;
        this.halatDeBaie = false;
    }

    public Pacient(boolean patRabatabil, boolean micDeJun, boolean papuciDeCamera, boolean halatDeBaie) {
        this.patRabatabil = patRabatabil;
        this.micDeJun = micDeJun;
        this.papuciDeCamera = papuciDeCamera;
        this.halatDeBaie = halatDeBaie;
    }

    public boolean isPatRabatabil() {
        return patRabatabil;
    }

    public boolean isMicDeJun() {
        return micDeJun;
    }

    public boolean isPapuciDeCamera() {
        return papuciDeCamera;
    }

    public boolean isHalatDeBaie() {
        return halatDeBaie;
    }

    @Override
    public Pacient build() {
        return new Pacient(patRabatabil,micDeJun,papuciDeCamera,halatDeBaie);
    }

    public Pacient setPatRabatabil(boolean patRabatabil) {
        this.setPatRabatabil(patRabatabil);
        return this;
    };
    public Pacient setMicDeJun(boolean micDeJun) {
        this.setMicDeJun(micDeJun);
        return this;
    };

    public Pacient setPapuciDeCamera(boolean papuciDeCamera) {
        this.setPapuciDeCamera(papuciDeCamera);
        return this;
    }

    public Pacient setHalatDeBaie(boolean halatDeBaie) {
        this.setHalatDeBaie(halatDeBaie);
        return this;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "patRabatabil=" + patRabatabil +
                ", micDeJun=" + micDeJun +
                ", papuciDeCamera=" + papuciDeCamera +
                ", halatDeBaie=" + halatDeBaie +
                '}';
    }
}
