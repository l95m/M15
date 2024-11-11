package beispiel;

/*
 * Wandeln Sie den String "Dieses Java Programm funktioniert" in ein char Array um.
 * Geben Sie über eine Schleife die Anzahl des Chars 'a' aus.
 */

public class StringWork1 {

	public static void main(String[] args) {
		
		String motto = "Dieses Java Programm funktioniert";
		int zeichenZähler = 0;
		char gesuchtesZeichen = 'a';
		
		// Umwandeln in ein char Array
		char[] einzelneBuchstaben = motto.toCharArray();
		
		// Über das Array iterieren
		for (int i = 0; i < einzelneBuchstaben.length; i++) {
			if (einzelneBuchstaben[i] == gesuchtesZeichen) {
				zeichenZähler++;
			}
		}
		System.out.print(zeichenZähler);
		
	}

}
