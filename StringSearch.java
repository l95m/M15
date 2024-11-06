package beispiel;

/*
 * Bringen Sie den String: "MISSISSIPPI" ins lower case Format und geben aus an welchem Index das erste 'p' vorkommt.
 */

public class StringSearch {

	public static void main(String[] args) {
		
		String mis = "MISSISSIPPI";
		// lower case
		mis = mis.toLowerCase();
		System.out.println(mis);
		
		// ersten Index mit 'p' ausgeben
		
		int indexp = mis.indexOf('p');
		System.out.println(indexp);
		
	}

}
