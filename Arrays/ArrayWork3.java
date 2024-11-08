package beispiel;

/*
 * Schreiben Sie eine Klasse, die ein Element an einem bestimmten Index aus einem Array "entfernt".
 * Geben Sie ein neues Array ohne das gesuchte Element zurück
 * Betrachten Sie den Fall, falls der gesuchte Index außerhalb der Grenzen des Arrays liegt.
 */

public class ArrayWork3 {

	public static void main(String[] args) {
		int[] numbers = {26, 54, 8, 17, 23, 4, 33};
		// Array zum Zwischenspeichern erstellen. Größe 1 kleiner als Ausgangarray
		int[] temp = new int[numbers.length-1];
		int deleteAtIndex = 3;
		boolean inbounds;
		
		// Prüfen ob Index innerhalb der Grenzen des Arrays liegt
		if (deleteAtIndex >= 0 && deleteAtIndex < numbers.length) {
			inbounds = true;
			
			for (int i = 0, j = 0; i < numbers.length; i++) {
				if (i != deleteAtIndex) {
					// Ins neue Array schreiben (Länge -1) am neuen Index j (0 bis Länge-1)
					temp[j] = numbers[i];
					j++;
				}
			}
		}
		else {
			inbounds = false;
			System.out.print("Index out of bounds");
		}
		
		// Zwischenspeicher der Variable wieder zuweisen
		numbers = temp;
		
		if (inbounds) {
			for (int i = 0; i < numbers.length; i ++ ) {
				System.out.print(numbers[i] + " ");
			}
		}
		
	}

}
