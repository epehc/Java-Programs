/**
 * Aufgabe Übung4 BMIBerechnung (nicht bewertet)
 * @author Jose Cardona
 *
 * Beschreibung: kurze Beschreibung der Funktion des Programms
 *
 *
 */

// fuegen Sie sinnvolle Kommentare ein !!!
import java.util.Scanner;

public class BMIBerechnung {

    public static double groesseEingeben() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie Ihre Größe ein: ");
        return scan.nextDouble();
    }

    public static char geschlechtEingeben(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihre Geschlecht (m/w) ein: ");

        return scan.next().charAt(0);
    }

    public static double gewichtEinlesen(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihre Gewicht in kg ein: ");
    
        return scan.nextDouble();
    }

    public static String bmiBerechnen(double groesse, char geschlecht, double gewicht){
        double bmi = gewicht / (groesse * groesse);
        System.out.println(bmi);

        if(geschlecht == 'm'){
            if(bmi < 20){
                return "Sie sind im Bereich \"Untergewicht\"";
            }
            else if(bmi >= 20 && bmi < 26){
                return "Sie sind im Bereich \"Normalgewicht\"";
            }
            else if(bmi >= 26 && bmi < 31){
                return "Sie sind im Bereich \"Übergewicht\"";
            }
            else if(bmi >= 31 && bmi < 41){
                return "Sie sind im Bereich \"Adipositas\"";
            }
            else {
                return "Sie sind im Bereich \"massive Adipositas\"";
            }
        }
        else{
            if(bmi < 19){
                return "Sie sind im Bereich \"Untergewicht\"";
            }
            else if(bmi >= 19 && bmi <= 24){
                return "Sie sind im Bereich \"Normalgewicht\"";
            }
            else if(bmi >= 25 && bmi <= 30){
                return "Sie sind im Bereich \"Übergewicht\"";
            }
            else if(bmi >= 31 && bmi <= 40){
                return "Sie sind im Bereich \"Adipositas\"";
            }
            else {
                return "Sie sind im Bereich \"massive Adipositas\"";
            }
        }
    }

    public static void main (String[] args) {

        double groesse = groesseEingeben();
        char geschlecht = geschlechtEingeben();
        double gewicht = gewichtEinlesen();
        String ergebnis = bmiBerechnen(groesse, geschlecht, gewicht);

        System.out.println(ergebnis);
    }
}