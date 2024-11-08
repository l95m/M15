package beispiel;

/*
 * int[] numbers = {26, 54, 8, 17, 23, 4, 33}

1. Schreiben Sie ein Klasse, die den durchschnittlen Wert eines Integer Arrays als double ausgibt.
 */

public class ArrayWork1 {

	public static void main(String[] args) {
		
		int[] numbers = {26, 54, 8, 17, 23, 4, 33};
		
		int summe = 0;
		double durchschnitt;
		
		// Summe durch addieren jeder Zahl am Index i
		for (int i = 0; i < numbers.length; i++) {
			summe += numbers[i];
		}
		
		// Durchschnitt errechnen durch casten zum double (Ansonsten fehlende Nachkomastellen)
		durchschnitt = (double) summe / numbers.length;
		
		System.out.print(durchschnitt);
	}

}
