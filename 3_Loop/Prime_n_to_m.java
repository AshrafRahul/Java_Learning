import java.util.Scanner;

public class Prime_n_to_m {
    public static void main(String[] args) {
        int m,n,count=0;
        Scanner input = new Scanner (System.in);

        System.out.print("Enter initial number: ");
        m = input.nextInt();

        System.out.print("Enter ending number: ");
        n = input.nextInt();

        for(int i=m; i<=n; i++){
            for(int j=2; j<=i-1; j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.print(i+" ");
            }
            count=0;
        }
    }
}
