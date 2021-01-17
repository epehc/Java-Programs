import java.util.Scanner;

public class Kreisberechnung {
    public static double berechneKreisUmfang(double r){
        return 2 * Math.PI * r;
    }

    public static double berechneKreisFlaeche(double r){
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kreisberechnung:");
        System.out.println("====================");
        System.out.print("Radius eingeben: ");
        double r = scan.nextDouble();

        System.out.println("Der Kreisumfang mit dem Radius " + r + " betraegt " + berechneKreisUmfang(r));
        System.out.printf("Der Kreisumfang mit dem Radius " + r + " betraegt " + "'%5.4f'%n", berechneKreisUmfang(r));
        System.out.println("Der Kreisflaeche mit dem Radius " + r + " betraegt " + berechneKreisFlaeche(r));
        System.out.printf("Der Kreisflaeche mit dem Radius " + r + " betraegt " + "'%5.4f'%n", berechneKreisUmfang(r));

    }
}
