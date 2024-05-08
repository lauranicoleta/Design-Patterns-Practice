package cts.test_practice.builder;

public class PacientBuilder implements Builder{
    Pacient pacient;

    public PacientBuilder(){
        pacient = new Pacient(false, false);
    }

    public PacientBuilder setMicDeJun(boolean micDeJun){
        this.pacient.setMicDeJun(micDeJun);
        return this;
    }
    public PacientBuilder setPatRabatabil(boolean patRabatabil){
        this.pacient.setPatRabatabil(patRabatabil);
        return this;
    }
    @Override
    public Pacient build() {
        return pacient;
    }
}
