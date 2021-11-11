package model;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Beschrijft een persoon die in dienst is bij ons bedrijf
 */
public class Werknemer extends Persoon {
    private static final double GRENSWAARDE_BONUS = 4500;
    private static final double DEFAULT_MAAND_SALARIS = 0;

    private double maandSalaris;

    public Werknemer(String naam, String woonplaats, Afdeling afdeling, double maandSalaris) {
        super(naam, woonplaats, afdeling);
        this.maandSalaris = maandSalaris;
    }

    public Werknemer(String naam) {
        super(naam);
        this.maandSalaris = DEFAULT_MAAND_SALARIS;
    }

    public Werknemer() {
        super();
        this.maandSalaris = DEFAULT_MAAND_SALARIS;
    }
}
