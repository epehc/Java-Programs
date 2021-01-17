import java.util.Random;

public class FEArrays {
    
    
    public static void main(String[] args) {
        char[] hallo = {'h', 'a', 'l', 'l', 'o'};
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int min = 1;
        int max = 100;
        int[] random = new int[10];


        for(char element : hallo){
            System.out.print(element);
        }

        System.out.println();

        for (int i : nums) {
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();

        
        for(int i = 0; i < random.length; i++){
            random[i] = new Random().nextInt(max) + min;
            System.out.print(random[i] + " ");            
        }
        

    }
}