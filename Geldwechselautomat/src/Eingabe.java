import java.util.Scanner;
import java.util.InputMismatchException;

public class Eingabe {
    public static String format = "Bitte in Format \"X,XX €\" oder \"XXX Cent\" eingeben. Versuchen Sie es erneut.";

/**
 * Aufgabe: Geldwechselautomat(bewertet)
 *
 * @author Jose Cardona
 *
 * Beschreibung: Klasse Eingabe zur Beschriftung aller Eingabe-Methode
 *
 */

    /**
     * Einlesen der Bentuzereingabe als String
     *
     * @return String next scanned line.
     */
    public static String einlesen(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Bitte geben Sie Ihre gewuenschte Betrag in Euro oder Cent zum Wechseln ein: ");
        return scan.nextLine();
    }

    /**
     * Einlesen der Bentuzereingabe in Euro oder Cent
     *
     * @return int (gueltiger Betrag in Cent)
     */
    public static int liesBetragEin() {
        String input = einlesen();
        int indexOfSpace;
        String inString;
        String toConvert = "";
        //Make sure the input starts with a number, has a comma and ends with the € Symbol
        if(Character.isDigit(input.charAt(0)) && input.contains(",") && input.endsWith(" €")){
            //Look for the space index to separate the String, in order to convert it
            indexOfSpace = input.indexOf(' ');
            int indexOfKomma = input.indexOf(',');
            inString = input.substring(0, indexOfSpace);
            //Check that there are only two digits after the comma
            if(inString.length() != indexOfKomma + 3){
                System.out.println("Es muessen nur 2 Stellen nach der Komma geben. Versuchen Sie es erneut...");
                return -1;
            }
            for (int i = 0; i < inString.length(); i++) {
                //Skip the "," symbol to make conversion to integer easier
                if(inString.charAt(i) == ',' || inString.charAt(i) == '.'){
                    continue;
                }
                else {
                    toConvert += inString.charAt(i);
                }
            }
            //Check that all the remaining String elements are numbers, if not start over
            for (int i =0; i< toConvert.length(); i++){
                if (!Character.isDigit(toConvert.charAt(i))){
                    System.out.println("Falsche Format Eingabe.");
                    System.out.println(format);
                    return -1;
                }
            }
            return Integer.parseInt(toConvert);
        }
        //Make sure the input starts with a number and ends with Cent
        else if(Character.isDigit(input.charAt(0)) && input.endsWith(" Cent")){
            indexOfSpace = input.indexOf(' ');
            inString = input.substring(0, indexOfSpace);
            //Check that all the String elements are numbers, if not start over
            for (int i =0; i< inString.length(); i++){
                if (!Character.isDigit(inString.charAt(i))){
                    System.out.println("Falsche Format Eingabe.");
                    System.out.println(format);
                    return -1;
                }
            }
            return Integer.parseInt(inString);
        }
        else{
            System.out.println(format);
            return -1;
        }
    }

    public static boolean weiterMachen(){
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Weiter?(j/n) ");
            char whatToDo = scan.next().charAt(0);
            if(whatToDo == 'j' || whatToDo == 'J'){
                return true;
            }
            else if(whatToDo == 'n' || whatToDo == 'N'){
                return false;
            }
            else{
                System.out.println("Nur 'j' und 'n' sind als Eingaben akzeptiert. Versuchen Sie es erneut.");
                return true;
            }
        }catch (InputMismatchException i){
            System.out.println("Nur einzige Buchstaben sind als Eingabe erlaubt.");
            weiterMachen();
        }
        return false;
    }
}
