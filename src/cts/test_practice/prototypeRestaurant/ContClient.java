package cts.test_practice.prototypeRestaurant;

public class ContClient implements ContClientAbstract{

    private String nume;
    private String numarDeTelefon;

    public ContClient(){
        this.nume = "";
        this.numarDeTelefon = "";
    }

    public ContClient(String nume, String numarDeTelefon) {
        this.nume = nume;
        this.numarDeTelefon = numarDeTelefon;
    }


    @Override
    public ContClientAbstract clone() {
        ContClient contClient = new ContClient();
        contClient.setNume(this.nume);
        contClient.setNumarDeTelefon(this.numarDeTelefon);
        return contClient;
    }


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNumarDeTelefon() {
        return numarDeTelefon;
    }

    public void setNumarDeTelefon(String numarDeTelefon) {
        this.numarDeTelefon = numarDeTelefon;
    }

    @Override
    public String toString() {
        return "ContClient{" +
                "nume='" + nume + '\'' +
                ", numarDeTelefon='" + numarDeTelefon + '\'' +
                '}';
    }
}
