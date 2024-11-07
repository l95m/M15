package beispiel;

/*
 *  12345		1 Leerzeichen
 *   1234		2 Leerzeichen
 *    123		...
 *     12
 *      1
 */

public class NestedLoops4 {

	public static void main(String[] args) {
		int rows = 4;
		int count = 5;

		for (int i = 0; i <= rows; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(" ");;
			}
			
			for (int k = 1; k <= count; k++) {
				System.out.print(k);
			}
			
			count--;
			System.out.println();
		}
	}
}
