public class Potenz {
    public static int potenzIterativ(int base, int pot) {
        int result = 1;
        while(pot > 0) {
            result = result * base;
            pot--;
        }
        return result;
    }
    public static int potenzRekursiv(int base, int pot) {
        if(pot == 0){
            return 1;
        }
        else{
            int result = base * potenzRekursiv(base, pot - 1);
            return result;
        }
    }

    public static void main(String[] args) {
        int iterativ = potenzIterativ(2,5);
        int rekursiv = potenzRekursiv(2,5);

        System.out.println("Iterativ: " + iterativ);
        System.out.println("Rekursiv: " + rekursiv);
    }
}
