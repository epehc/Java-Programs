import java.util.Scanner;

public class password{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int versuch;
        int password = 1234;
        int count = 0;
        while(count < 3){
            System.out.println("Bitte Password einlesen, versuch " + (count + 1));
            versuch = scan.nextInt();
            if(versuch == password){
                System.out.println("Willkommen!");
                break;
            }
            else{
                System.out.println("Fehler");
                if(count == 2){
                    System.out.println("Abbruch");
                    break;
                }
                count++;
            }
            
        }
    }
}