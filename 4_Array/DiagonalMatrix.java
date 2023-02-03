import java.util.Scanner;

public class DiagonalMatrix{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[][] A = new int[3][3];
        int sumOfdiagonal = 0;
        int sumOfUpperElement = 0;
        int sumofLowerElement = 0;

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                A[i][j] = input.nextInt();
            }
        }

        System.out.println("Matrix A: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i==j){
                    sumOfdiagonal = sumOfdiagonal+A[i][j];
                }
                if(i<j){
                    sumOfUpperElement = sumOfUpperElement+A[i][j];
                }
                if(i>j){
                    sumofLowerElement = sumofLowerElement+A[i][j];
                }
            }
        }
        System.out.println("Sum of diagonal elements: "+sumOfdiagonal);
        System.out.println("Sum of upper elements: "+sumOfUpperElement);
        System.out.println("Sum of lower elements: "+sumofLowerElement);
    }
}