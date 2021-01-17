/**
 * Aufgabe Taschenrechner (nicht bewertet)
 * @author Jose Cardona 577913
 *
 * Beschreibung: Einfaches Taschenrechner
 *
 *
 */
// Den folgenden Klassenrahmen mit Ihrem Quellcode ersetzen!

import java.util.Scanner;

public class Taschenrechner {


    public static double zahlEinlesen(int welcheZahl) {
 		/* der Parameter welcheZahl gibt Auskunft darüber, ob der Benutzer die erste oder
		zweite Zahl eingeben soll. Es wird eine Zahl von der Tastatur eingelesen und als Rückgabewert
		an die aufrufende Methode zurückgegeben */
        Scanner scan = new Scanner(System.in);
        if(welcheZahl == 1){
            System.out.println("Erste Zahl eingeben: ");
            double erste = scan.nextDouble();
            return erste;
        }
        else{
            System.out.println("Zweite Zahl eingeben: ");
            double zweite = scan.nextDouble();
            return zweite;
        }
    }
    public static char menue(){
        /* zeigt dem Benutzer die Auswahlmöglichkeiten an und liest diese von der Tastatur ein */
        Scanner scan = new Scanner (System.in);
        System.out.println("Bitte wählen Sie aus: ");
        System.out.println("1 Addition");
        System.out.println("2 Substraktion");
        System.out.println("3 Multiplikation");
        System.out.println("4 Division");
        System.out.println("n Neue Zahlen eingeben");
        System.out.println("e Beenden");

        char auswahl = scan.next().charAt(0);
        return auswahl;
    }
    public static double addieren(double x, double y) {
 	/* addiert die als Eingabeparameter übergebenen Zahlen und übergibt das Ergebnis als
	Rückgabewert an die aufrufende Methode */
        return x + y;
    }
    public static double subtrahieren(double x, double y) {
 	/* subtrahiert die als Eingabeparameter übergebenen Zahlen und übergibt das Ergebnis als
	Rückgabewert an die aufrufende Methode */
        return x - y;
    }
    public static double multiplizieren(double x, double y) {
 	/* multipliziert die als Eingabeparameter übergebenen Zahlen und übergibt das Ergebnis als
	Rückgabewert an die aufrufende Methode */
        return x * y;
    }
    public static double dividieren(double x, double y) {
 	/* dividiert die als Eingabeparameter übergebenen Zahlen und gibt das Ergebnis als
	Rückgabewert an die aufrufende Methode zurück. Die Division durch 0 ist unzulässig!
	Achtung!-> die Methode nur mit gültigen Parametern aufrufen (d.h schon im switch die
	Zulässigkeit des Divisors prüfen und eine Fehlermeldung ausgeben). */
        return x / y;
    }
    public static void gibErgebnisAus(double x, double y, char op, double erg){
        /* gibt das Ergebnis auf 2 Nachkommastellen begrenzt aus */
        switch (op){
            case('1'):
                System.out.printf("%4.2f + %4.2f = %4.2f\n\n", x ,y, erg);
                break;
            case('2'):
                System.out.printf("%4.2f - %4.2f = %4.2f\n\n", x ,y, erg);
                break;
            case('3'):
                System.out.printf("%4.2f * %4.2f = %4.2f\n\n", x ,y, erg);
                break;
            case('4'):
                System.out.printf("%4.2f / %4.2f = %4.2f\n\n", x ,y, erg);
                break;
            default:
                System.out.println("Falsche Eingabe\n\n");
                break;
        }

    }


    public static void main(String[] args) {
        System.out.println("Taschenrechner");
        System.out.println("==============");

        double erste = zahlEinlesen(1);
        double zweite = zahlEinlesen(2);
        char op;
        boolean status = false;

        while(status == false) {
            op = menue();
            switch (op) {
                case ('1'):
                    double add = addieren(erste, zweite);
                    gibErgebnisAus(erste, zweite, '1', add);
                    break;
                case ('2'):
                    double sub = subtrahieren(erste, zweite);
                    gibErgebnisAus(erste, zweite, '2', sub);
                    break;
                case ('3'):
                    double mul = multiplizieren(erste, zweite);
                    gibErgebnisAus(erste, zweite, '3', mul);
                    break;
                case ('4'):
                    if (zweite == 0) {
                        System.out.println("Division durch 0 unzulässig.\n");
                        break;
                    }
                    double div = dividieren(erste, zweite);
                    gibErgebnisAus(erste, zweite, '4', div);
                    break;
                case('n'):
                    erste = zahlEinlesen(1);
                    zweite = zahlEinlesen(2);
                    break;
                case('e'):
                    status = true;
                    System.out.println("Programm beendet.");
                    break;
                default:
                    System.out.println("Falsche Eingabe.");
                    break;
            }
        }
    }
}

