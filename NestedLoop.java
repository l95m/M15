package beispiel;

/*
 * Ausgabe über verschachtelte Schleifen
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 
 */


public class NestedLoop {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 3; i++) {
			
			for (int j = 1; j <= 5; j++) {
				System.out.print(j + " ");
			}
			
			System.out.println();
			System.out.println();
		}
		
		
	}

}
