public class Kinosaal{
    private int saalNummer;
    private int anzahlSitzplaetzeSaal;
    private static int anzahlSitzplaetzeKino;
    private static int anzahlKinoSaele;

    // getter and setter methods for Instance variables
    public int getAnzahlSitzplaetzeSaal() {
        return anzahlSitzplaetzeSaal;
    }

    public void setAnzahlSitzplaetzeSaal(int zahl) {
        anzahlSitzplaetzeSaal = zahl;
        setAnzahlSitzplaetzeKino(zahl);
    }

    public int getSaalNummer() {
        return saalNummer;
    }

    public void setSaalNummer(int zahl) {
        saalNummer = zahl;
        increaseAnzahlKinoSaele();
    }

    // getter and setter for class variables
    static int getAnzahlSitzplaetzeKino() {
        return anzahlSitzplaetzeKino;
    }
    static void setAnzahlSitzplaetzeKino(int zahl){
        anzahlSitzplaetzeKino += zahl;
    }

    static  int getAnzahlKinoSaele(){
        return anzahlKinoSaele;
    }
    static void increaseAnzahlKinoSaele(){
        anzahlKinoSaele++;
    }

    public void print(){
        System.out.println("SaalNr: " + getSaalNummer() + " hat " + getAnzahlSitzplaetzeSaal() + " Sitzplaetze");
    }

    static void printFinal(){
        System.out.println("Gesamtzahl Sitzplaetze: " + getAnzahlSitzplaetzeKino());
    }
}