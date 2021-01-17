public class SummenBildung {
    public static int summenIterativ(int n){
        int result = 0;
        for(int i = 1; i <= n; i++){
            result = result + i;
        }
        return result;
    }

    public static int summenRekursiv(int n) {
        if(n == 0){
            return 0;
        }
        else{
            int result = n + summenRekursiv(n - 1);
            return result;
        }
    }

    public static void main(String[] args) {
        int iterativ = summenIterativ(5);
        int rekursiv = summenRekursiv(5);

        System.out.println("Iterativ: " + iterativ);
        System.out.println("Rekursiv: " + rekursiv);
    }
}
