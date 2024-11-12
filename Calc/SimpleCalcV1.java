package beispiel;  // IHR PACKAGE!

/*Erstellen Sie eine Klasse die einen Taschenrechner simuliert. 
 * Die Operationen Addieren, Suptrahieren, Multiplizieren und Dividieren sollen als eigene Methoden erstellt werden.
 * Zudem soll der Taschenrechner das aktuelle Zwischenergebnis darstellen können
 * oder das Zwischenergebnis zurück auf 0 setzen. 
 * Des weiteren soll auch die Zahl π als eine static "Methode" implementiert werden (Hinweis "final").
 */

import java.math.*;

public class SimpleCalcV1 {

	public static void main(String[] args) {
		double number1 = 4.20;
		double number2 = PI();
		
		SimpleCalc sc = new SimpleCalc();
		
		System.out.print(sc.mult(number1, number2));
	}
	
	public double add (double number1, double number2) {
		double ergebnis = number1 + number2;
		return ergebnis;
	}
	
	public double sub (double number1, double number2) {
		double ergebnis = number1 - number2;
		return ergebnis;
	}
	
	public double mult (double number1, double number2) {
		double ergebnis = number1 * number2;
		return ergebnis;
	}
	
	public double div (double number1, double number2) {
		if (number2 != 0) {
		double ergebnis = number1 / number2;
		return ergebnis;
		}
		else {
			return 0;
		}
	}
	
	public static double PI() {
		final double pi = Math.PI;
		return pi;
	}
	
}
