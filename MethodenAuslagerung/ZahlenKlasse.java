package beispiel;

import java.util.Scanner;

public class ZahlenKlasse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Bitte Kontonummer eingeben:");
		String kontonummer = input.nextLine();

		ZahlenKlasse zk = new ZahlenKlasse();
		kontonummer = zk.nullenEntfernen(kontonummer);
		
		System.out.println(kontonummer);
	}
	
	
	public String nullenEntfernen (String zahlen) {
		int ersteZahl = 0;

		for (int i = 0; i < zahlen.length(); i++) {
			if (zahlen.charAt(i) != '0') {
				ersteZahl = i;
				break;
			}
		}

		zahlen = zahlen.substring(ersteZahl);

		return zahlen;
	}
}
