package ial.aufgaben;

/*
 * 	Implementieren Sie ein Programm, welches zu einem vorgegebenen Geldwert ausrechnet,
 *  mit welchen Geldscheinen man ihn auszahlen kann. Zur Auszahlung stehen Scheine im Wert von
 *  500, 200, 100, 50, 20, 10 und 5 Euro zur Verfügung.
 *  
 *  Ausgabe:
 *  Wie teilt sich der Geldbetrag: 1058
	500er-Scheine: 2
	200er-Scheine: 0
	100er-Scheine: 0
	...
	Rest: 3
 */

public class Scheinausgabe {

	public static void main(String[] args) {
		int cash = 903;
		System.out.println("Der Geldbetrag ist: " + cash + "€");
		
		System.out.println("500er:\t" + cash / 500);
		cash %= 500;
		
		System.out.println("200er:\t" + cash / 200);
		cash %= 200;
		
		System.out.println("100er:\t" + cash / 100);
		cash %= 100;
		
		System.out.println("50er:\t" + cash / 50);
		cash %= 50;
		
		System.out.println("20er:\t" + cash / 20);
		cash %= 20;
		
		System.out.println("10er:\t" + cash / 10);
		cash %= 10;
		
		System.out.println("5er:\t" + cash / 5);
		cash %= 5;
		
		
		System.out.println("Rest:\t" + cash + "€");
	}

}



