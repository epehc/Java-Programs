public class Ausgabe {
    private static final String[] coins = {"2,00 €", "1,00 €", "50 Cent", "20 Cent", "10 Cent", "5 Cent", "2 Cent", "1 Cent"};
/**
 * Aufgabe: Geldwechselautomat(bewertet)
 *
 * @author Jose Cardona
 *
 * Beschreibung: Klasse Ausgabe zur Beschriftung aller Ausgabe-Methode
 *
 */


    /**Ausgabe
     * 3 Muenze/n zu 2,00 €
     * 1 Muenze/n zu 1,00 €
     * 0 Muenze/n zu 50 Cent
     * usw
     * @param ergbnis int[] Das Array, das die Anzahl der eingewechselten
    Muenzen enthält
     */
    public static void printBetrag(int betrag){
        System.out.println("Folgender Betrag soll gewechselt werden: " + betrag + " Cent");
    }

    public static void ausgabeBetraginMuenzen( int[] ergebnis ){
        for (int i = 0; i < ergebnis.length; i++){
            System.out.println(ergebnis[i] + " Muenze/n zu " + coins[i]);
        }
    }

    }
