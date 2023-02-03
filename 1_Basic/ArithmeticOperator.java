import java.util.Scanner;

public class ArithmeticOperator{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int n1, n2;

        System.out.print("Enter number1: ");
        n1 = input.nextInt();
        System.out.print("Enter number2: ");
        n2 = input.nextInt();

        System.out.println("Sum: "+(n1+n2));
        System.out.println("Sub: "+(n1-n2));
        System.out.println("Mul: "+(n1*n2));
        System.out.println("Div: "+(n1/n2));
        System.out.println("Mod: "+(n1%n2));
        
    }
}