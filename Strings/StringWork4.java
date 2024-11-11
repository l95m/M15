package beispiel;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Prüfen Sie, ob 2 Strings ein Anagramm sind. Geben Sie einen bool true aus wenn es des Fall ist.
 * Bsp: str1 = "Leben" str2="Nebel" -> True!
 */

public class StringWork4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Erstes Wort eingeben");
		String str1 = input.nextLine();
		System.out.println("Zweites Wort eingeben");
		String str2 = input.nextLine();
		
		boolean isAnagram;
		
		if (str1.length() != str2.length()) {
			isAnagram = false;
			System.out.print("Anagramm nicht möglich da Länge nicht gleich!"); // Ausgabe optional
		}
		else {
		// lowercase
		String str1lower = str1.toLowerCase();
		String str2lower = str2.toLowerCase();
		
		// create char arrays
		char[] str1array = str1lower.toCharArray();			// {'l', 'e', 'b', 'e', 'n'}
		char[] str2array = str2lower.toCharArray();			// {'n', 'e', 'b', 'e', 'l'}
		
		// sort
		Arrays.sort(str1array);
		Arrays.sort(str2array);
		
		//are arrays equal?
		isAnagram = Arrays.equals(str1array, str2array);
		}
		
		if (isAnagram) {
			System.out.print(str1 + " und " + str2 + " sind ein Anagramm");
		}
		else {
			System.out.print(" " + str1 + " und " + str2 + " sind kein Anagramm");
		}
	}

}
