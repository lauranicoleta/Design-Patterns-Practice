package cts.test2_practice.facade.spital;

public class InternarePacient {
    public void interneazaPacient(Pacient pacient){
        Medic medic = new Medic("Medic 1");
        Salon salon = new Salon(1,2);

        if(medic.confirmareMedic(pacient)){
            if(salon.getNrSalon() > 0){
                System.out.println(pacient.toString() + " a fost internat cu succes!");
            }else {
                System.out.println("Salonul nu mai are locuri disponibile.");
            }
        }else{
            System.out.println("Pacientul nu necesita internare.");
        }
    }
}
