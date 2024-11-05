package beispiel;

public class ArrayWork {

	public static void main(String[] args) {
											
		// Array vom Datentyp int, welches die Zahlen von 10 bis 15 enthält
		
		int[] arrayA = {10, 11, 12, 13, 14, 15};
		
		// Array Erstellen und per for-Schleife Befüllen
		
		int[] arrayB = new int[6];
		
		for (int i = 0; i < arrayB.length; i++) {
			arrayB[i] = i + 10;
		}
		
		// Geben Sie die Elemente am 1. und 3. Index aus
		
		System.out.println(arrayB[1] + " " + arrayB [3]);
		
		
		// Berechne die Summe aller Elemente des Arrays
		
		int summe = 0;
		for (int i = 0; i < arrayB.length; i++) {
			summe += arrayB[i];
		}
		System.out.println(summe);
		
		
		// Gebe alle Elemente die Größer als 12 sind aus
		
		for (int i = 0; i < arrayB.length; i++) {
			if (arrayB[i] > 12) {
				System.out.println(arrayB[i]);
			}
		}
		
		// Tausche das 2. und 4. Element
		
		int temp;
		
		temp = arrayB[2];
		arrayB[2] = arrayB[4];
		arrayB[4] = temp;
	}

}
