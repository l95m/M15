package ial.aufgaben;

public class SchaltjahrAlternative {

	public static void main(String[] args) {
		int year = 1994;
		boolean leapYear;
		
		if (year % 400 == 0) {
            leapYear = true;
        } 
		else if (year % 100 == 0) {
            leapYear = false;
        } 
        else if (year % 4 == 0) {
            leapYear = true;
        } 
        else {
            leapYear = false;
        }
		
		System.out.print(year + " is a leap year? " + leapYear);
	}
}
