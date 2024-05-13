package cts.test2_practice.strategy.banca;

public class PersoaneFizice implements Strategy{
    @Override
    public void procesareDocumente(String tipClient) {
        System.out.println("Pentru " + tipClient + " se solicita buletinul si adeverinta de munca.");
    }
}
