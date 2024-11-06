package beispiel;

import java.util.Random;

public class NotenspiegelLösung {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] noten = new int[25];
		
		for (int i = 0; i < 25; i++) {
		    noten[i] = rand.nextInt(6)+1;
		}	

		for (int i = 0; i < noten.length; i++) {
			System.out.print(noten[i] + " ");
		}
		System.out.print("\n\n");
		
		// Geben Sie die Anzahl jeder Note aus
		
		int eins = 0, zwei = 0, drei = 0, vier = 0, fünf = 0, sechs = 0;
		
		for (int i = 0; i < noten.length; i++) {
			if (noten[i] == 1) {
				eins += 1;
			}
			else if (noten [i] == 2) {
				zwei += 1;
			}
			else if (noten [i] == 3) {
				drei += 1;
			}
			else if (noten [i] == 4) {
				vier += 1;
			}
			else if (noten [i] == 5) {
				fünf += 1;
			}
			else {
				sechs += 1;
			}
		}
		
		System.out.println("Note:\tEins\tZwei\tDrei\tVier\tFünf\tSechs\n"
						+"Anzahl:\t"+eins+"\t"+zwei+"\t"+drei+"\t"+vier+"\t"+fünf+"\t"+sechs);
		
		
		System.out.print("\n\n");
		
		
		
		// Erstelle ein Array mit der Anzahl jeder Note {10, 4, 3, 5, 1, 2}
		//										         1   2  3  4  5  6
		
		
		int[] notenAnzahl = new int[7];					//  [0],[1],[2],[3],[4],[5],[6] 
														//  {0 , 0 , 0 , 0 , 0 , 0 , 0}
		for(int i = 0; i < noten.length; i++) {
			
			for (int j = 1; j < notenAnzahl.length; j++) {
				if (noten[i] == j) {
					notenAnzahl[j] += 1;
				}
			}
			
		}
		
		for (int i = 1; i < notenAnzahl.length; i++) {
			System.out.print(notenAnzahl[i] + "  ");
		}
		
		System.out.print("\n\n");
		// Geben Sie den Notenschnitt aus
		
		int notenSumme = 0;
		
		for (int i = 0; i < noten.length; i++) {
			notenSumme += noten[i];
		}
		
		double notenschnitt = (double) notenSumme / noten.length;
		System.out.print(notenschnitt);
	}	
}








