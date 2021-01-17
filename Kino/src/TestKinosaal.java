public class TestKinosaal {
    public static void main(String[] args) {
        Kinosaal saalNr1 = new Kinosaal();
        Kinosaal saalNr2 = new Kinosaal();
        Kinosaal saalNr3 = new Kinosaal();

        //assign values to Kinosaele
        saalNr1.setSaalNummer(1);
        saalNr1.setAnzahlSitzplaetzeSaal(35);
        saalNr2.setSaalNummer(2);
        saalNr2.setAnzahlSitzplaetzeSaal(50);
        saalNr3.setSaalNummer(3);
        saalNr3.setAnzahlSitzplaetzeSaal(100);

        //print the result
        saalNr1.print();
        saalNr2.print();
        saalNr3.print();
        Kinosaal.printFinal();
    }
}
