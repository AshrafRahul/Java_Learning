import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num, sum=0, temp, r;
        System.out.print("Enter any number: ");
        num = input.nextInt();

        temp = num;
        while(temp!=0){
            r = temp%10;
            sum = sum*10 + r;
            temp = temp/10;
        }
        
        if(num==sum){
            System.out.println("This is a palindrom number");
        }
        else{
            System.out.println("This is not a plaindrom number");
        }
    }
}
