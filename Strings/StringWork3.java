package beispiel;

/*
 * Aus einem String von Zahlen sollen die Zeichen gelöscht werden bis zur ersten "richtigen Zahl" (1-9). 
 * str = "00000000015704204" -> output = "15704204" (Datentyp String)
 */

public class StringWork3 {

	public static void main(String[] args) {
		String zahlen = "00000000015704204";
		
		int ersteZahl = 0;
		
		for (int i = 0; i < zahlen.length(); i++) {
			if (zahlen.charAt(i) != '0') {
				ersteZahl = i;
				break;
			}
		}
		
		zahlen = zahlen.substring(ersteZahl);
		
		System.out.print(zahlen);
	}

}
