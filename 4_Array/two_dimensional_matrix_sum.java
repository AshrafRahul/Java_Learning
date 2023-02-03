import java.util.Scanner;

public class two_dimensional_matrix_sum {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        //int[][] add = new int[2][3];

        //getting input for A matrix
        System.out.println("Enter elements for A matrix: ");
        for(int row=0; row<2; row++){
            for(int col=0; col<3; col++){
                A[row][col] = input.nextInt();
            }
        }
        //getting input for B matrix
        System.out.println("Enter elements for B matrix: ");
        for(int row=0; row<2; row++){
            for(int col=0; col<3; col++){
                B[row][col] = input.nextInt();
            }
        }

        System.out.println();
        //Printing A matrix
        System.out.println("A: ");
        for(int row=0; row<2; row++){
            for(int col=0; col<3; col++){
                System.out.print(A[row][col]+" ");
            }
            System.out.println();
        }
        //Printing B matrix
        System.out.println("B: ");
        for(int row=0; row<2; row++){
            for(int col=0; col<3; col++){
                System.out.print(B[row][col]+" ");
            }
            System.out.println();
        }

        System.out.println();

        //add = A matrix + B matrix
        System.out.println("A matrix + B matrix: ");
        for(int row=0; row<2; row++){
            for(int col=0; col<3; col++){
                System.out.print((A[row][col] + B[row][col])+" ");
            }
            System.out.println();
        }
    }
}
