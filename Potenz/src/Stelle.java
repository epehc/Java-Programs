public class Stelle {
    public static int stelleIterativ(int n){
        int count = 0;
        while(n >= 1){
            n = n / 10;
            count++;
        }
        return count;
    }
    public static int stelleRekursiv(int n){
        if(n < 10){
            return 1;
        }
        else{
            return 1 + stelleRekursiv(n/10);
        }
    }
    public static void main(String[] args) {
        int iterativ = stelleIterativ(100);
        int rekursiv = stelleRekursiv(10000);

        System.out.println("Iterativ: " + iterativ);
        System.out.println("Rekursiv: " + rekursiv);
    }
}
