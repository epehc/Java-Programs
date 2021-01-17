public class Geldwechselautomat {

    /**
     * Aufgabe: Geldwechselautomat(bewertet)
     *
     * @author Jose Cardona
     *
     * Beschreibung: Klasse Geldwechselautomat, wo die Umrechnung durchgeführt wird.
     *
     */

    public static final int[] muenze = {200, 100, 50, 20, 10, 5, 2, 1};
    private int[] menge = new int[muenze.length];

    /**Umrechnung des Betrages in Muenzen
     * @param betrag (int) einzuwechselnder Betrag in Cent
     * @return int[] das Array mit der Anzahl für jede Muenze, in die der
    Betrag gewechselt wurde. */

    public int[] umrechnung(int betrag){
        for (int i = 0; i < muenze.length; i++) {
            menge[i] = betrag / muenze[i];
            betrag -= menge[i] * muenze[i];
        }
        return menge;
    }
}
