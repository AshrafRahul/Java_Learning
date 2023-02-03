import java.util.Scanner;

public class PositiveNegative{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int num;

        System.out.print("Enter any number: ");
        num = scan.nextInt();

        if(num>0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
    }
}