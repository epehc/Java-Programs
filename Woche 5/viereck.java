import java.util.Scanner;

public class viereck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Einzahl der Zeilen: ");
        int zeilen = sc.nextInt();
        System.out.println("Einzahl der Spalten: ");
        int spalten = sc.nextInt();

        for(int i = 1; i <= zeilen; i++){
            for(int j = 1; j <= spalten; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
