package beispiel;

/*
 * Erstellen Sie eine Klasse, die Vorname, Name und Alter einliest und diese dann Zeile für Zeile ausgibt.
 */

import java.util.Scanner;

public class ScannerWork1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Vorname, Name, Alter
		
		System.out.println("Bitte Vorname eingaben:");
		String vorname = input.nextLine();
		
		System.out.println("Bitte Name eingaben:");
		String nachname = input.nextLine();
		
		System.out.println("Bitte Alter eingaben:");
		int alter = input.nextInt();
		
		System.out.println(vorname + ", " + nachname + ", " + alter);
	}

}
