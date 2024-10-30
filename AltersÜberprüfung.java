package ial.aufgaben;

/*	<14 - "Du darfst noch nicht Mofa fahren"
	<16, >=14 - "Du darfst Mofa fahren, aber nicht Moped"
	<18, >=16 - "Du darfst Moped fahren, aber nicht Auto"
	>=18 - "Du darfst endlich Auto fahren!"
 */

import java.util.Scanner; 

public class Alterüberprüfung {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);					// neues Objekt der Klasse Scanner
		String output;
		System.out.print("Wie ist dein Alter?\n");
		
		
		int age = input.nextInt();								// Methode auf dem Objekt Input angwandt
		
		
		if (age <= 0) {
			output = "Du Witzbold!";
		}
		else if (age > 0 && age < 14) {
			output = "Du darfst noch nicht Mofa fahren";
		}
		else if (age >= 14 && age < 16) {
			output = "Du darfst Mofa fahren, aber nicht Moped";
		}
		else if (age >= 16 && age < 18) {
			output = "Du darfst Moped fahren aber nicht Auto";
		}
		else {
			output = "Du darfst endlich Auto fahren!";
		}

		System.out.print(output);
	}

}
