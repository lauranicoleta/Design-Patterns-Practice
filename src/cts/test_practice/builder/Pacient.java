package cts.test_practice.builder;

public class Pacient {

    private boolean micDeJun;
    private boolean patRabatabil;


    public Pacient(boolean micDeJun, boolean patRabatabil) {
        this.micDeJun = micDeJun;
        this.patRabatabil = patRabatabil;
    }

    public boolean isMicDeJun() {
        return micDeJun;
    }

    protected void setMicDeJun(boolean micDeJun) {
        this.micDeJun = micDeJun;
    }

    public boolean isPatRabatabil() {
        return patRabatabil;
    }

    protected void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "micDeJun=" + micDeJun +
                ", patRabatabil=" + patRabatabil +
                '}';
    }
}
