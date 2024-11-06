package beispiel;

/*
 * Geben Sie für folgenden String aus, wie oft das Zeichen 'e', und das Zeichen 'C' vorkommt: Strophe Lied
 */

public class StringCount {

	public static void main(String[] args) {
		String strophe = "Drei Chinesen mit dem Kontrabass\r\n"
				+ "saßen auf der Straße und erzählten sich was.\r\n"
				+ "Da kam die Polizei, fragt: Was ist denn das?‘\r\n"
				+ "Drei Chinesen mit dem Kontrabass.";
		
		
		int i = 0, eSum = 0, CSum = 0;
		
		while (i < strophe.length()) {
			if (strophe.charAt(i) == 'e') {
				eSum++;
			}
			if (strophe.charAt(i) == 'C') {
				CSum++;
			}
			i++;
		}
		
		System.out.print("e: " + eSum + "\tCSum: " + CSum);
		
	}

}
