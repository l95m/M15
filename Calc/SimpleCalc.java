package beispiel;
/*
 * Erstellen Sie eine Klasse die einen Taschenrechner simuliert. 

Die Operationen Addieren, Suptrahieren, Multiplizieren und Dividieren sollen als eigene Methoden erstellt werden. Zudem soll der Taschenrechner das aktuelle Zwischenergebnis darstellen können oder das Zwischenergebnis zurück auf 0 setzen. 

Des weiteren soll auch die Zahl π als eine static "Methode" implementiert werden (Hinweis "final").
 * Erweiterung in der main:

2 doubles über Scanner eingeben und dann über einen String Input die geforderte Operation einlesen. Danach Switch case anwenden.
 */
import java.util.Scanner;

public class SimpleCalc {

    double ergebnis;
    public static final double PI = 3.141592653589793;

    public SimpleCalc() {
        ergebnis = 0.0;
    }

    public void addiere(double zahl) {
        ergebnis = ergebnis + zahl;
        System.out.println("Ergebnis nach Addition: " + ergebnis);
    }

    public void subtrahiere(double zahl) {
        ergebnis = ergebnis - zahl;
        System.out.println("Ergebnis nach Subtraktion: " + ergebnis);
    }

    public void multipliziere(double zahl) {
        ergebnis = ergebnis * zahl;
        System.out.println("Ergebnis nach Multiplikation: " + ergebnis);
    }

    public void dividiere(double zahl) {
        if (zahl != 0) {
            ergebnis = ergebnis / zahl;
            System.out.println("Ergebnis nach Division: " + ergebnis);
        } else {
            System.out.println("Fehler: Man kann nicht durch Null teilen.");
        }
    }

    public double zeigeErgebnis() {
        return ergebnis;
    }

    public void setzeZurueck() {
        ergebnis = 0.0;
        System.out.println("Ergebnis zurückgesetzt auf: " + ergebnis);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleCalc meinRechner = new SimpleCalc();

        System.out.print("Geben Sie die erste Zahl ein: ");
        double zahl1 = scanner.nextDouble();

        System.out.print("Geben Sie die zweite Zahl ein: ");
        double zahl2 = scanner.nextDouble();

        meinRechner.ergebnis = zahl1;

        System.out.print("Welche Operation möchten Sie durchführen? (+, -, *, /): ");
        String operation = scanner.next();

        switch (operation) {
            case "+":
                meinRechner.addiere(zahl2);
                break;
            case "-":
                meinRechner.subtrahiere(zahl2);
                break;
            case "*":
                meinRechner.multipliziere(zahl2);
                break;
            case "/":
                meinRechner.dividiere(zahl2);
                break;
            default:
                System.out.println("Ungültige Operation.");
                break;
        }

        System.out.println("Aktuelles Ergebnis: " + meinRechner.zeigeErgebnis());

        System.out.println("Der Wert von PI ist: " + SimpleCalc.PI);

        scanner.close();
    }
}
