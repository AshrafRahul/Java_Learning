import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num;

        System.out.print("Enter any number: ");
        num = input.nextInt();

        if(num%2==0){
            System.out.println("Even");
        }
        else if(num%2!=0){
            System.out.println("Odd");
        }
        else{
            System.out.println("Enter a valid number");
        }
    }
}
