public class KontoTest{
    public static void main(String[] args) {

        //Work through the data for the first account
        Konto konto1 =  new Konto();
        konto1.setKontoinhaber("Anna Schulze");
        konto1.setKontonummer(72354);
        konto1.setSaldo(102.56);

        //Data for the second account
        Konto konto2 = new Konto();
        konto2.setKontoinhaber("Johanna Schmidt");
        konto2.setKontonummer(69713);
        konto2.setSaldo(40.0);

        //Data for the third account
        Konto konto3 = new Konto();
        konto3.setKontoinhaber("Ekki Lang");
        konto3.setKontonummer(93757);
        konto3.setSaldo(75900.32);

        //Ausgabe
        konto1.infoKontoinhaber();
        konto1.infoKontonummer();
        konto1.zahlEin(25.85);
        konto1.zahlAus(500);

        System.out.println();

        konto2.infoKontoinhaber();
        konto2.infoKontonummer();
        konto2.zahlEin(25.85);
        konto2.zahlAus(50.0);

        System.out.println();

        konto3.infoKontoinhaber();
        konto3.infoKontonummer();
        konto3.zahlEin(10000.85);
        konto3.zahlAus(50000.0);

    }
}