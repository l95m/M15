package ial.aufgaben;

/*
 * 	1 2 3 4
	1 2 3 4
	1 2 3 4
 */

public class NestedLoops1 {

	public static void main(String[] args) {
		
		int rows = 3;
		
		for (int i = 1; i <= rows; i++) {
			
			for (int j = 1; j <= 4; j++) {
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
		
		
	}

}
