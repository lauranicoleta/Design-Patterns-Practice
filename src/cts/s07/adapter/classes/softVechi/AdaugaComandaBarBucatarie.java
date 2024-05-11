package cts.s07.adapter.classes.softVechi;

import cts.s07.adapter.classes.softNou.Bar;
import cts.s07.adapter.classes.softNou.Bautura;

public class AdaugaComandaBarBucatarie extends Bar implements SoftBucatarie{
    @Override
    public void adaugareProdus(Produs produs) {
        Bautura bautura = new Bautura(produs.getDenumire(), produs.getPret(), 0);
        super.adaugaBautura(bautura);
    }

    @Override
    public void printareBon() {
        super.tiparesteNota();
    }
}
