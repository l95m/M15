package beispiel;

import java.util.Random;

public class WürfelDuell {
	public static void main (String[] args) {
		
		Würfelspiel1 spieler1 = new Würfelspiel1();
		Würfelspiel1 spieler2 = new Würfelspiel1();
		
		int spieler1punkte = spieler1.würfeln();
		int spieler2punkte = spieler2.würfeln();
		
		if (spieler1punkte > spieler2punkte) {
			System.out.print("Spieler1 gewinnt mit " + spieler1punkte);
		}
		else if (spieler2punkte > spieler1punkte) {
			System.out.print("Spieler2 gewinnt mit " + spieler2punkte);
		}
		else {
			System.out.print("Unentschieden. Beide haben " + spieler1punkte);
		}
	}
	
	
	public int würfeln() {
		Random rand = new Random();
		int augenSumme;
		augenSumme = rand.nextInt(6)+1;
		augenSumme += rand.nextInt(6)+1;
		augenSumme += rand.nextInt(6)+1;
		return augenSumme;
	}
}
