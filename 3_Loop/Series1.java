import java.util.Scanner;

public class Series1{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num, sum=0;

        System.out.print("Enter the last number: ");
        num = input.nextInt();

        for(int i=1; i<=num; i++){
            if(i==num){
                System.out.print(i+" = ");
            }
            else{
                System.out.print(i+" + ");
            }
            sum = sum+i;
        }
        System.out.println(sum);
    }
}