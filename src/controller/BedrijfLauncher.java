package controller;

import model.Afdeling;
import model.Persoon;
import model.Werknemer;
import model.ZZPer;

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

        Werknemer baas = new Werknemer("Mark", "Den Haag", afdelingen[2], 10000);
        Werknemer medewerker = new Werknemer("Caroline", "Delft", afdelingen[1], 4000);
        ZZPer assistent = new ZZPer("Klaas", "Diemen", afdelingen[3], 50);
        ZZPer projectleider = new ZZPer("Ronald", "Zaandam", afdelingen[0], 80);

        assistent.huurIn(160);
        projectleider.huurIn(320);

        Persoon[] personen = {
                baas,
                medewerker,
                assistent,
                projectleider};

        for (Persoon persoon : personen) {
            toonJaarInkomen(persoon);
        }
    }

    public static void toonJaarInkomen(Persoon persoon) {
        System.out.printf("%s verdient %.2f per jaar\n", persoon.getNaam(), persoon.berekenJaarInkomen());
    }
}
