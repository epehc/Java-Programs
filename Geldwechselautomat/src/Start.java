public class Start {

    /**
     * Aufgabe: Geldwechselautomat(bewertet)
     *
     * @author Jose Cardona
     *
     * Beschreibung: Klasse Start, wo alles zusammen durchgefuehrt wird
     *
     */

    public static void main(String[] args) {
        Geldwechselautomat automat = new Geldwechselautomat();
        boolean state = true;
        while(state) {
            int[] ergebnis;
            int betrag = Eingabe.liesBetragEin();
            if(betrag > 0) {
                ergebnis = automat.umrechnung(betrag);
                Ausgabe.printBetrag(betrag);
                Ausgabe.ausgabeBetraginMuenzen(ergebnis);
            }
            else if(betrag == 0){
                System.out.println("Kein Wechselgeld beim Betrag 0.");
            }
            state = Eingabe.weiterMachen();
        }
    }
}
