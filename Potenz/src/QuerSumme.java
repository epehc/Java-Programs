public class QuerSumme {
    public static int querIterativ(int n) {
        int result = 0;
        while (n >= 1){
            result = result + (n % 10);
            n = n / 10;
        }
        return result;
    }
    public static int querRekursiv(int n){
        if(n <= 1){
            return 0;
        }
        else{
            int result = (n % 10) + querRekursiv(n / 10);
            return result;
        }
    }

    public static void main(String[] args) {
        int iterativ = querIterativ(417);
        int rekursiv = querRekursiv(417);

        System.out.println("Iterativ: " + iterativ);
        System.out.println("Rekursiv: " + rekursiv);
    }
}
