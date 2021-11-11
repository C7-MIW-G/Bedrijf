package controller;

import model.Afdeling;
import model.Persoon;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Laat de werking van mijn bedrijf zien
 */
public class BedrijfLauncher {

    public static void main(String[] args) {
        Afdeling[] afdelingen = new Afdeling[4];
        afdelingen[0] = new Afdeling("Uitvoering", "Hilversum");
        afdelingen[1] = new Afdeling("Support", "Amsterdam");
        afdelingen[2] = new Afdeling("Management", "Almere");
        afdelingen[3] = new Afdeling("Documentatie", "Gouda");

        Persoon baas = new Persoon("Mark", "Den Haag", afdelingen[2]);
        Persoon medewerker = new Persoon("Caroline", "Delft", afdelingen[1]);
        Persoon assistent = new Persoon("Klaas");

        System.out.printf("Het aantal personen in het bedrijf is %d\n", Persoon.aantalPersonen);
        System.out.println(baas + " " + medewerker);
        System.out.println(medewerker.toString());

    }
}
