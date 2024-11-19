package klausur;

/*
 * 2. Erstellen Sie eine Klasse, die folgendes Muster durch die Verwendung von verschachtelten Schleifen ausgibt:
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 */

public class Aufgabe2 {

	public static void main(String[] args) {
		int number = 1;
		
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(number + " ");
				number++;
			}
			System.out.println();
		}
	}

}
