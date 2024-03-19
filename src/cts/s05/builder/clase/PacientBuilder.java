package cts.s05.builder.clase;

public class PacientBuilder implements Builder{
    Pacient pacient;
    public PacientBuilder(){
        pacient = new Pacient(false, false, false, false);
    }

    public PacientBuilder setPatRabatabil(boolean patRabatabil) {
        this.pacient.setPatRabatabil(patRabatabil);
        return this;
    };
    public PacientBuilder setMicDeJun(boolean micDeJun) {
        this.pacient.setMicDeJun(micDeJun);
        return this;
    };

    public PacientBuilder setPapuciDeCamera(boolean papuciDeCamera) {
        this.pacient.setPapuciDeCamera(papuciDeCamera);
        return this;
    }

    public PacientBuilder setHalatDeBaie(boolean halatDeBaie) {
        this.pacient.setHalatDeBaie(halatDeBaie);
        return this;
    }
    @Override
    public Pacient build() {
        return pacient;
    }
}
