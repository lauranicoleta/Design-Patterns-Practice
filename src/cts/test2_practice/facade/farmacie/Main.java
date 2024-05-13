package cts.test2_practice.facade.farmacie;

public class Main {
    public static void main(String[] args){
        Client client = new Client("elena", true);
        Client client1 = new Client("Ioan", false);

        CumparaMedicament cumparaMedicament = new CumparaMedicament();
        cumparaMedicament.cumparaMedicament(client);
        cumparaMedicament.cumparaMedicament(client1);
    }
}
