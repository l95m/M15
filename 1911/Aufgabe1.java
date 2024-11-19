package klausur;

/*
 * 1. Erstellen Sie ein char Array der Länge 10.
 * Es soll mithilfe einer Schleife mit den ersten zehn Zeichen des Alphabets gefüllt werden.
 * Danach soll für jedes Element per Typkonversion der zugehörige Integer in der Konsole ausgegeben werden. 
 */

public class Aufgabe1 {

	public static void main(String[] args) {
		char[] alphabet = new char[10];				// {'','','','',...}
		
		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = (char)('a' + i);
		}
		
		for (int i = 0; i < alphabet.length; i++) {
			System.out.print((int)alphabet[i] + " ");;
		}
		
	}

}
