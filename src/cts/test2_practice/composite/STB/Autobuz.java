package cts.test2_practice.composite.STB;

public class Autobuz {
    private String producator;
    private String model;
    private Grup grup;

    public Autobuz(String producator, String model, Grup grup) {
        this.producator = producator;
        this.model = model;
        this.grup = grup;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Grup getGrup() {
        return grup;
    }

    public void setGrup(Grup grup) {
        this.grup = grup;
    }

    public void afiseazaFlota() {
        System.out.println("Autobuz{" +
                "producator='" + producator + '\'' +
                ", model='" + model + '\'' +
                ", grup=" );
        grup.afisareStructura("    ");
    }
}
