public class TestArray {
    public static void main(String[] args) {
        int[] myArray = {1,3,4,5,7,8,9,5,6,11};

        
        ArrayMethoden.printArray(myArray);
        ArrayMethoden.arrayGet(myArray, 7);
        ArrayMethoden.arrayGet(myArray, 10);

        ArrayMethoden.arraySum(myArray);

        ArrayMethoden.mittelwert(myArray);

        ArrayMethoden.quadrat(myArray);

        ArrayMethoden.max(myArray);

        ArrayMethoden.zweitGroesstesElement(myArray);

        ArrayMethoden.min(myArray);

        ArrayMethoden.zaehleGeradeZahlen(myArray);
    }
    
}
