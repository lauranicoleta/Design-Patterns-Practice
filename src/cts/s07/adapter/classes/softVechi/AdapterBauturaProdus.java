package cts.s07.adapter.classes.softVechi;

import cts.s07.adapter.classes.softNou.Bautura;

public class AdapterBauturaProdus extends Produs{
    private Bautura bautura;

    public AdapterBauturaProdus(Bautura bautura) {
        super(bautura.getDenumire(), bautura.getPret());
        this.bautura = bautura;
    }
}
