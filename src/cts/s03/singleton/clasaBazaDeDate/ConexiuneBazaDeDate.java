package cts.s03.singleton.clasaBazaDeDate;

public class ConexiuneBazaDeDate {
    private String numeBaza;
    private int nrTabele;
    private static ConexiuneBazaDeDate instanta = null;
    private String linkConexiune;

    private ConexiuneBazaDeDate(String numeBaza, int nrTabele, String linkConexiune) {
        this.numeBaza = numeBaza;
        this.nrTabele = nrTabele;
        this.linkConexiune = linkConexiune;
    }

    public String getLinkConexiune() {
        return linkConexiune;
    }

    public void setLinkConexiune(String linkConexiune) {
        this.linkConexiune = linkConexiune;
    }

    public String getNumeBaza() {
        return numeBaza;
    }

    public void setNumeBaza(String numeBaza) {
        this.numeBaza = numeBaza;
    }

    public int getNrTabele() {
        return nrTabele;
    }

    public void setNrTabele(int nrTabele) {
        this.nrTabele = nrTabele;
    }

    public static ConexiuneBazaDeDate getInstanta() {
        return instanta;
    }

    public static void setInstanta(ConexiuneBazaDeDate instanta) {
        ConexiuneBazaDeDate.instanta = instanta;
    }

    public static synchronized ConexiuneBazaDeDate getInstance(String numeBaza,
                                                               int nrTabele,
                                                               String linkConexiune)
    {
        if(instanta == null){
            instanta = new ConexiuneBazaDeDate(numeBaza, nrTabele, linkConexiune);
        }
        return instanta;
    }

    @Override
    public String toString() {
        return "ConexiuneBazaDeDate{" +
                "numeBaza='" + numeBaza + '\'' +
                ", nrTabele=" + nrTabele +
                ", linkConexiune='" + linkConexiune + '\'' +
                '}';
    }
}
