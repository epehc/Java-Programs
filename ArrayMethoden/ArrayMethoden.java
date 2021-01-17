public class ArrayMethoden{

    static void printArray(int[] array){
        System.out.print("Inhalt des Arrays: ");
        for (int i : array) {
            System.out.print(i + " ");            
        }
        System.out.println();
    }
    static int arrayGet(int[] array, int i){
        if (i >= array.length || i < 0){
            return Integer.MIN_VALUE;
        }
        else{
            System.out.println("Feldinhalt an Position " + i + ": " + array[i]);
        }
        return array[i];
    }
    static int arraySum(int[] array){
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println("Summe aller Feldelemente: " + sum);
        return sum;
    }

    static double mittelwert(int[] array){
        int sum = arraySum(array);
        double mit = sum / array.length;
        System.out.println("Mittelwert: " + mit);
        return mit;
    }
    static void quadrat(int[] array){
        System.out.println("Feldelemente quadrieren");
        for (int i = 0; i < array.length; i++){
            array[i] = array[i] * array[i];
        }
        printArray(array);
    }
    static int max(int[] array){
        int big = 0;
        for(int i = 0; i < array.length; i ++){
            if(array[i] > big){
                big = array[i];
            }
        }
        System.out.println("Größter Wert: " + big);
        return big;
    }
    static int zweitGroesstesElement(int[] array){
       int big = max(array);
       int zweit = 0;

       for(int i = 0; i < array.length; i++){
           if(array[i] > zweit && zweit < big){
               zweit = array[i];
           }
       }
       System.out.println("Zweitgrößter Wert: " + zweit);
       return zweit;
    }
    static int min(int[] array){
        int small = array[0];

        for(int i = 1; i < array.length; i++){
            if(array[i] < small){
                small = array[i];
            }
        }
        System.out.println("Kleinster Wert: " + small);
        return small;
    }
    static int zaehleGeradeZahlen(int[] array){
        int count = 0;
        for (int i : array) {
            if(i % 2 == 0){
                count++;
            }
        }
        System.out.println("Anzahl gerader Zahlen: " + count);
        return count;
    }
}