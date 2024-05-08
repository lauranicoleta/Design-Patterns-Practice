package cts.test_practice.builderExtraOptiuniRestaurant;

public class Program {
    public static void main(String[] args){

        Rezervare rezervare = new RezervareBuilder().setAsezareLaGeam(true).setDecorareaMesei(false).setScauneArgonomice(false).buid();
        System.out.println(rezervare.toString());

    }
}
