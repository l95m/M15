package ial.aufgaben;

import java.time.*;

public class Schaltjahr2 {

	public static void main(String[] args) {
		
		int year = 2000;												// Fettes Brot lässt grüßen
		int month = 2;
		int days;
		boolean leapYear;
		
		switch (month) {
			case 1, 3, 5, 7, 8, 10, 12:									// Monate mit 31 Tagen 
				days = 31;
				break;
			case 4, 6, 9, 11:											// Monate mit 30 Tagen
				days = 30;
				break;
			case 2:														// Monate mit 28 oder 29 Tagen		
				if (year % 4 == 0 && year%100!= 0 || year%400 == 0) {	// Schaltjahr Überprüfung
					leapYear = true;
					days = 29;
				}
				else {
					leapYear = false;
					days = 28;
				}
				break;
			default:													// Monatswert nicht 1 bis 12
				days = 0;
				break;
		}
		
		//Ausgabe
		if (days != 0) {
			String extra = (days == 29) ? "\nLeapyear!!!" : "\nKein Schaltjahr";			//Zusatz bei der Ausgabe
			System.out.println("The month of " + Month.of(month).name() + " in the year " + year + " has " + days + " days!" + extra);
		}
		else {
			System.out.println("Bitte einen korrekten Monatswert (1-12) eingeben!");
		}
		
	}
	
}
