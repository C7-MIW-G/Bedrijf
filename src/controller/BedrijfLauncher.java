package controller;

import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Laat de werking van mijn bedrijf zien
 */
public class BedrijfLauncher {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Geef de naam: ");
        String naam = keyboard.nextLine();
        System.out.print("Geef de woonplaats: ");
        String woonplaats = keyboard.nextLine();
        System.out.print("Geef de naam van de afdeling: ");
        String afdelingsNaam = keyboard.nextLine();
        System.out.print("Geef de plaats van de afdeling: ");
        String afdelingsPlaats = keyboard.nextLine();

        boolean werknemerGemaakt = false;
        while (!werknemerGemaakt) {
            System.out.print("Geef het maandsalaris: ");
            double maandsalaris = keyboard.nextDouble();
            try {
                Werknemer werknemer = new Werknemer(naam, woonplaats, new Afdeling(afdelingsNaam, afdelingsPlaats),
                        maandsalaris);
                werknemerGemaakt = true;
                System.out.println(werknemer);
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            } finally {
                System.out.println("Je invoer is op de juiste wijze afgehandeld.");
            }
        }

    }

    public static void toonJaarInkomen(Persoon persoon) {
        System.out.printf("%s verdient %.2f per jaar\n", persoon.getNaam(), persoon.berekenJaarInkomen());
    }
}
