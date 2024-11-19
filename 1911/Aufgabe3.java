package klausur;

/*
 * Erstellen Sie eine Methode, die einen Integer n überreicht bekommt. 
 * Die Methode gibt die Fakultät für n zurück (int).
 */

public class Aufgabe3 {

	public static void main(String[] args) {
		int zahl = 12;
		
		System.out.print(factorial(zahl));
	}

	
	public static long factorial (int n) {
		long fac = 1;
		
		for (int i = 1; i <= n; i++) {
			fac *= i;
		}
		
		return fac;
	}
}
