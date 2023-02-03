public class find_output {
    public static void main(String[] args) {
        int[][] num = new int[4][5];
        int k=0;

        for(int i=0; i<4; i++){
            for(int j=0; j<5; j++){
                num[i][j] = k;
                k++;
            }
        }

        for(int i=0; i<4; i++){
            for(int j=0; j<5; j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }
}
