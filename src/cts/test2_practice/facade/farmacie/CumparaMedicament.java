package cts.test2_practice.facade.farmacie;

public class CumparaMedicament {
    public void cumparaMedicament(Client client){
        DepozitFarmacie depozitFarmacie = new DepozitFarmacie(2);
        RetetaClient retetaClient = new RetetaClient(1);
        if(retetaClient.verificareAsigurare(client)){
            if(retetaClient.getNrMedicamenteSolicitate() <= depozitFarmacie.getMedicamenteDisponibile()){
                System.out.println(client.toString() + " a cumparat cu succes!");
            }else {
                System.out.println("Nu exista cantitatea necesara de medicamente in depozit.");
            }
        }else{
            System.out.println(client.toString() + " nu are asigurare valida.");
        }
    }
}
