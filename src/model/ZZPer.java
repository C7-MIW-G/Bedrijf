package model;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Dit beschrijft een externe persoon die door ons wordt ingehuurd
 */
public class ZZPer extends Persoon {
    public static final int DEFAULT_UREN_GEWERKT = 0;
    private double uurtarief;
    private int urenGewerkt;

    public ZZPer(String naam, String woonplaats, Afdeling afdeling, double uurtarief) {
        super(naam, woonplaats, afdeling);
        this.uurtarief = uurtarief;
        this.urenGewerkt = DEFAULT_UREN_GEWERKT;
    }

    public void huurIn(int uren) {
        urenGewerkt += uren;
    }

    @Override
    public double berekenJaarInkomen() {
        return uurtarief * urenGewerkt;
    }

    @Override
    public String toString() {
        return String.format("%s en is een zzp-er met een uurtarief van %.2f", super.toString(), this.uurtarief);
    }
}
