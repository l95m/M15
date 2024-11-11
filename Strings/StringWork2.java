package beispiel;

/*
 * Str = "Dies ist ein Beispiel"
 * Geben Sie alle Worte innerhalb des Strings mit einer geraden Anzahl an Zeichen aus. 
 * (Hinweis "\s" ist ein Leerzeichen)
 * Output: Dies, Beispiel,
 */

public class StringWork2 {

	public static void main(String[] args) {
		String motto = "Dies ist ein Beispiel";
		
		String[] worte = motto.split(" ");				// Andere Möglichkeit "\s"
		
		for (int i = 0; i < worte.length; i++) {
			if(worte[i].length() % 2 == 0) {
				System.out.print(worte[i] + " ");
			}
		}
	}

}
