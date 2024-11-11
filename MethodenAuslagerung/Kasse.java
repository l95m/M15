package beispiel;

import java.util.Scanner;
import java.util.Locale;

public class Kasse {

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
		
		Kasse geldspeicher = new Kasse();
		double gesamtPreis = geldspeicher.gesamtpreisBerechnen(anzahlArtikel, preisArtikel);
		double rückGeld = geldspeicher.rückgeldBerechnen(geldKunde, gesamtPreis);
		
		
		System.out.println("Gesamtpreis: " + gesamtPreis + " Rückgeld: " + rückGeld);
	}

	public double gesamtpreisBerechnen (int artikelAnzahl, double artikelPreis) {
		double gesamtPreis = artikelPreis * artikelAnzahl;
		return gesamtPreis;
	}
	
	public double rückgeldBerechnen (double einzahlWert, double gesamtPreis) {
		double rückgeld = einzahlWert-gesamtPreis;
		return rückgeld;
	}
}




