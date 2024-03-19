package cts.s05.builder.clase;

public class Pacient {
    private boolean patRabatabil;
    private boolean micDeJun;
    private  boolean papuciDeCamera;
    private boolean halatDeBaie;

    public Pacient(boolean patRabatabil, boolean micDeJun, boolean papuciDeCamera, boolean halatDeBaie) {
        this.patRabatabil = patRabatabil;
        this.micDeJun = micDeJun;
        this.papuciDeCamera = papuciDeCamera;
        this.halatDeBaie = halatDeBaie;
    }

    public boolean isPatRabatabil() {
        return patRabatabil;
    }

    protected void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    public boolean isMicDeJun() {
        return micDeJun;
    }

    protected void setMicDeJun(boolean micDeJun) {
        this.micDeJun = micDeJun;
    }

    public boolean isPapuciDeCamera() {
        return papuciDeCamera;
    }

    protected void setPapuciDeCamera(boolean papuciDeCamera) {
        this.papuciDeCamera = papuciDeCamera;
    }

    public boolean isHalatDeBaie() {
        return halatDeBaie;
    }

    protected void setHalatDeBaie(boolean halatDeBaie) {
        this.halatDeBaie = halatDeBaie;
    }
}
