// Ihr package

import java.util.Random;

public class Notenspiegel {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] noten = new int[25];
		
		for (int i = 0; i < 25; i++) {
		    noten[i] = rand.nextInt(6)+1;
		}	

		for (int element : noten) {
			System.out.print(noten[element] + " ");
		}
		System.out.print("\n\n");
		
		// Geben Sie die Anzahl jeder Note aus
		
		
		
		// Erstellen mit der Anzahl jeder Note {10, 4, 3, 5, 1, 2}
		//										1   2  3  4  5  6
		
		
		
		// Geben Sie den Notenschnitt aus
		
	}	
}
