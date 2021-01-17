public class PunktTest {
    public static void main(String[] args) {
    
        Punkt p1 = new Punkt();
        p1.setX(1); p1.setY(2); p1.setFarbe("grün");

        Punkt p2 = new Punkt();
        p2.setX(3); p2.setY(5); p2.setFarbe("gelb");

        //Aufgabe a,b
        System.out.println("Aufg a,b):");
        System.out.println("Ausgabe in main mit System.out.");
        System.out.format("Punkt1: x= %d; y= %d; farbe= %s", p1.getX(), p1.getY(), p1.getFarbe());
        System.out.println();
        System.out.format("Punkt2: x= %d; y= %d; farbe= %s", p2.getX(), p2.getY(), p2.getFarbe());

        System.out.println();
        System.out.println();

        //Aufgabe c
        System.out.println("Aufg c): Ausgabe über der print()-Methode");
        System.out.print("Punkt1: ");
        p1.print();
        System.out.println();
        System.out.print("Punkt2: ");
        p2.print();

        System.out.println();
        System.out.println();

        //Aufgabe d
        p1.verschiebeUmEins();
        p2.verschiebeUmEins();
        System.out.println("Aufg d): Ausgabe nach verschiebeUmEins()");
        System.out.print("Punkt1: ");
        p1.print();
        System.out.println();
        System.out.print("Punkt2: ");
        p2.print();

        System.out.println();
        System.out.println();

        //Aufgabe e
        p1.verschiebe(2,2);
        p2.verschiebe(0,0);
        System.out.println("Aufg e): Ausgabe nache verschiebe() mit delta");
        System.out.print("Punkt1: ");
        p1.print();
        System.out.println();
        System.out.print("Punkt2: ");
        p2.print();

        System.out.println();
        System.out.println();

        //Aufgabe f
        p2.setFarbe("rot"); p2.setX(3); p2.setY(5);
        System.out.println("Aufg f): neue Werte für p2");
        System.out.print("Punkt2: ");
        p2.print();

        System.out.println();
        System.out.println();

        //Aufgabe g
        Punkt p3 = new Punkt();
        p3.defaultValues();
        Punkt p4 = new Punkt();
        p4.setX(7); p4.setY(9); p4.setFarbe("rosa");
        System.out.println("Aufg g): neue Punkte p3 p4 mit Konstruktoren");
        System.out.print("Punkt3: ");
        p3.print();
        System.out.println();
        System.out.print("Punkt4: ");
        p4.print();

        System.out.println();
        System.out.println();

        //Aufgabe h,i
        Punkt p5 = new Punkt();
        p5.setX(5); p5.setY(3); p5.setFarbe("cyan");
        Punkt p6 = new Punkt();
        p6.setX(7); p6.setY(9); p6.setFarbe("magenta");
        System.out.println("Aufgabe h,i): Abstand zwischen 2 Punkten");
        double delta = p5.berechneDistanz(p6);
        p5.printDistanz(p5, p6, delta);
    }

}
