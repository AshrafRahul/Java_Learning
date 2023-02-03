import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int number;

        System.out.print("Enter any number: ");
        number = scan.nextInt();

        System.out.println("Your number is: "+number);
    }
}
