package beispiel;

/*
 * Ein Scanner liest folgende Variablen ein:
 * Anzahl der Artikel?
 * Preis pro Artikel?
 * Wieviel gibt der Kunde?
 * Danach geben Sie den gesamten Preis und das Rückgeld des Kunden aus
 */

import java.util.Scanner;
import java.util.Locale;

public class ScannerWork2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Zur Arbeit mit Komma: 
		// sc.useLocale(Locale.GERMANY);
		
		// Zur Arbeit mit Punkt:
		sc.useLocale(Locale.US);
		
		System.out.println("Bitte Anzahl der Artikel eingeben");
		int anzahlArtikel = sc.nextInt();
		System.out.println("Bitte Preis der Artikel eingeben");
		double preisArtikel = sc.nextDouble();
		System.out.println("Bitte erhaltenes Geld eingeben");
		double geldKunde = sc.nextDouble(); 
		
		
		double gesamtPreis = preisArtikel * anzahlArtikel;	// double cast?
		double rückGeld = geldKunde - gesamtPreis;
		
		System.out.println("Gesamtpreis: " + gesamtPreis + " Rückgeld: " + rückGeld);
	}

}
