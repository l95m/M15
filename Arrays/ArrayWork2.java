package beispiel;

/*
 * 	Schreiben Sie eine Klasse welche den Index eines gesuchten Elements wiedergibt.
	int gesuchtesElement;
	Für den Fall, dass so ein Element nicht existiert. Geben Sie aus, dass nichts gefunden wurde.
 */

public class ArrayWork2 {

	public static void main (String[] args) {
		
		int[] numbers = {26, 54, 8, 17, 23, 4, 33};
		int gesuchtesElement = 4;
		int gefundenerIndex = 0;
		boolean gefunden = false;
		
		for (int i = 0; i < numbers.length; i ++) {
			if (numbers[i] == gesuchtesElement) {
				gefundenerIndex = i;
				gefunden = true;
			}
		}
		
		if (gefunden) {
			System.out.print("Gefunden am Index " + gefundenerIndex);
		}
		else {
			System.out.print("Das Element " + gesuchtesElement + " gibt es nicht.");
		}
	}
}
