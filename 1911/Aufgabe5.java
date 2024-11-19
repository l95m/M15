package klausur;

/* Erstellen Sie eine Methode, die 2 Strings übergeben bekommt und diese abhängig davon,
 * welcher String mit dem "früheren" Zeichen im Alphabet startet danach aneinander konkateniert zurückgibt.
 * Bsp: ("Abc" und "Def" -> "AbcDef"; "XYZ" "abc" -> "abcXYZ")
 */

public class Aufgabe5 {

	public static void main(String[] args) {
		String str1 = "DEF";
		String str2 = "abc";
		
		Aufgabe5 a5 = new Aufgabe5();
		
		System.out.print(a5.ordnen(str1, str2));
	}

	
	public String ordnen (String a, String b) {
		String aLow = a.toLowerCase();
		String bLow = b.toLowerCase();
		
		if (aLow.charAt(0) < bLow.charAt(0)) {
			return a+b;
		}
		else if (aLow.charAt(0) > bLow.charAt(0)) {
			return b+a;
		}
		else {
			return a + " " + b;
		}
	}
}
