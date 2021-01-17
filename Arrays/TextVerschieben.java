public class TextVerschieben {
    public static void main(String[] args) {
        char[] feld = {'D','e','m','o','n','s','t','r','a','t','i','o','n','*','*','*'};
        char[][] zwischen = new char[4][4];
        char[] result = new char[16];
        int k = 0;
        int l = 0;

        for(int i = 0; i <= 3; i++){
            for(int j=0; j<= 3; j++){
                zwischen[i][j] = feld[k];
                k++;
                System.out.print(zwischen[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i <= 3; i++){
            for(int j =0; i<= 3; j++){
                result[l] = zwischen[j][i];
                l++;
                System.out.print(result[l]);
            }
        }
    }
}
