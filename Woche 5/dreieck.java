import java.util.Scanner;

public class dreieck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Anzahl der Zeilen: ");
        int zeilen = sc.nextInt();
        for(int i = 1; i <= zeilen; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
