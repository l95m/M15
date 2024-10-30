package ial.aufgaben;

public class Schaltjahr {

	public static void main(String[] args) {
		int year = 2000;
		boolean leapYear;
		
		
		if (year % 4 == 0 && year%100!= 0 || year%400 == 0) {
			leapYear = true;
		}
		else {
			leapYear = false;
		}
		
		System.out.println(year + " is a leap year? " + leapYear);
		
		if (leapYear) {
			System.out.print("Yes!");
		}
		else {
			System.out.print("Nope!");
		}
	}

}
