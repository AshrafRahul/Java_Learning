import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num, sum=0, temp, rem;

        System.out.print("Enter any number: ");
        num = input.nextInt();

        temp = num;
        while(temp!=0){
            rem = temp%10;
            sum = sum+rem*rem*rem;
            temp = temp/10;
        }
        if(num==sum){
            System.out.println("This is a Amstrong number");
        }
        else{
            System.out.println("This is not a Amstrong number");
        }
    }
}
