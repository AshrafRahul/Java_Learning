import java.util.Scanner;

public class Sum_Avg {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        double[] num = new double[5];
        double sum=0,avg;

        System.out.println("Enter 5 numbers: ");

        for(int i=0; i<num.length; i++){
            System.out.print("Number["+i+"]: ");
            num[i] = input.nextDouble();
        }

        for(int i=0; i<num.length; i++){
            sum = sum+num[i];
        }

        System.out.println("The sum is: "+sum);
        
        double len = num.length;
        System.out.println("Average is: "+(sum/len));
    }
    
}
