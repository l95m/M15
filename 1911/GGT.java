package beispiel;

/*
 * 4. Erstellen Sie eine Methode, die 2 Integer überreicht bekommt und dann größten gemeinsamen Teiler zurückgibt.
 */

public class GGT {

	public static void main(String[] args) {
		int a = 64, b = 8;
		
		GGT gt = new GGT();
		
		System.out.print(gt.größterTeiler(a, b));
	}

	
	public int größterTeiler (int n1, int n2) {
		int ggt = 1;
		
		for (int i = 1; i <= n1 && i <= n2; i++) {
			// Prüfen ob beide Zahlen ohne Rest teilbar sind
			if (n1 % i == 0 && n2 % i == 0) {
				ggt = i;
			}
		}
		return ggt;
	}
}
