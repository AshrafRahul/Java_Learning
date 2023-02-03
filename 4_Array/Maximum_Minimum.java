import java.util.Scanner;

public class Maximum_Minimum {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        double[] num = new double[5];
        double sum=0,avg;

        System.out.println("Enter 5 numbers: ");

        for(int i=0; i<num.length; i++){
            System.out.print("Number["+i+"]: ");
            num[i] = input.nextDouble();
        }

        double max = num[0];
        double min = num[0];
        for(int i=1; i<num.length; i++){
            if(max<num[i]){
                max = num[i];
            }
            if(min>num[i]){
                min = num[i];
            }
        }
        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);
    }
}
