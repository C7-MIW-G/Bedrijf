package model;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Beschrijft een persoon die werkzaamheden voor ons bedrijf verricht.
 */
public class Persoon {
    private static final double GRENSWAARDE_BONUS = 4500.0;
    private static final String DEFAULT_NAAM = "Onbekend";
    private static final String DEFAULT_WOONPLAATS = "Onbekend";
    private static final int DEFAULT_MAAND_SALARIS = 0;

    public static int aantalPersonen = 0;

    private int personeelsNummer;
    private String naam;
    private String woonplaats;
    private double maandSalaris;
    private Afdeling afdeling;

    public Persoon(String naam, String woonplaats, double maandSalaris, Afdeling afdeling) {
        this.setNaam(naam);
        this.woonplaats = woonplaats;
        this.setMaandSalaris(maandSalaris);
        this.afdeling = afdeling;

        this.personeelsNummer = ++aantalPersonen;
    }

    public Persoon(String naam) {
        this(naam, DEFAULT_WOONPLAATS, DEFAULT_MAAND_SALARIS, new Afdeling());
    }

    public Persoon() {
        this(DEFAULT_NAAM);
    }

    public double berekenJaarInkomen() {
        return 12 * maandSalaris;
    }

    public boolean heeftRechtOpBonus(){
        return maandSalaris >= GRENSWAARDE_BONUS;
    }

    public int getPersoneelsNummer() {
        return personeelsNummer;
    }

    public void setPersoneelsNummer(int personeelsNummer) {
        this.personeelsNummer = personeelsNummer;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public double getMaandSalaris() {
        return maandSalaris;
    }

    public void setMaandSalaris(double maandSalaris) {
        if (maandSalaris < 0) {
            System.out.println("Het maandsalaris mag niet negatief zijn, het wordt nu op 0 gezet.");
            this.maandSalaris = 0;
        } else {
            this.maandSalaris = maandSalaris;
        }
    }

    public Afdeling getAfdeling() {
        return afdeling;
    }
}
