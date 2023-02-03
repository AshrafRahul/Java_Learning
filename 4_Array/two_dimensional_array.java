import java.util.Scanner;

public class two_dimensional_array{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[][] number = new int[2][3];

        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.print("Number["+i+"]["+j+"]: ");
                number[i][j] = input.nextInt();
            }
        }
        System.out.println();
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.println("Number["+i+"]["+j+"]: "+number[i][j]);
            }
        }
    }
}