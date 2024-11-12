package beispiel;

/*
 * Ein Spieler kann ich in einem zweidimensionalen Raum in alle Himmelsrichtungen
 * (Norden „N“, Süden „S“, Osten „O“ und Westen „W“) bewegen. Entwickeln Sie einen Algorithmus, der für eine
 * beliebe Bewegungseingabe ausgibt, ob der Spieler wieder am Start steht.
 * 
 * Input: String (Scanner)		Output: Boolean (Am Startpunkt bzw x=0 y=0)
 */
import java.util.Scanner;

public class SchritteImRaum {

	public static void main(String[] args) {
		System.out.println("Enter directions: (\"S\", \"N\", \"O\", \"W\")");	
		
		Scanner sc = new Scanner(System.in);
		
		String directions = sc.next();
		directions = directions.toUpperCase();
		
		SchritteImRaum sir = new SchritteImRaum();
		
		if (sir.atStart(directions) ) {
			System.out.println("At home");
		}
		else {
			System.out.println("You are lost");
		}
	}

	public boolean atStart (String directions) {
		int x = 0, y = 0, invalids = 0;
		
		for (int i = 0; i < directions.length(); i++) {
			switch (directions.charAt(i)) {
			case 'S':
				y--;
				break;
			case 'N':
				y++;
				break;
			case 'O':
				x++;
				break;
			case 'W':
				x--;
				break;
			default:
				invalids++;
			}
		}
		System.out.println(invalids + " invalid Inputs");
		return (x == 0 && y == 0);
	}
}
