public class ZahlenZiehung {
    public static void main(String[] args) {
        int[] count = new int[50];
        int gezogen;

        for(int i = 1; i <= 100; i++) {
            gezogen = zieheZahl();
            count[gezogen]++;
        }
        for (int i = 1; i < count.length; i++){
            System.out.println("Die Zahl " + i + " wurde " + count[i] + "-mal gezogen.");
        }
    }

    public static int zieheZahl(){
        int zufallsZahl = (int) (Math.random() * 49 + 1);
        return zufallsZahl;
    }
    
}
