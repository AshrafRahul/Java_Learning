import java.util.Arrays;

public class array_sorting {
    public static void main(String[] args) {
        int[] num = {10,-3,18,5,25};

        Arrays.sort(num);

        System.out.print("Ascending order: ");
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }

        System.out.println();

        System.out.print("Descending order: ");
        for(int i=num.length-1; i>=0; i--){
            System.out.print(num[i]+" ");
        }

        System.out.println();
        System.out.println();

        //for String
        String[] names = {"Muhammad", "Ashraful", "Islam", "Rahul"};
        Arrays.sort(names);

        System.out.print("Ascending order: ");
        for(int i=0; i<names.length; i++){
            System.out.print(names[i]+" ");
        }

        System.out.println();

        System.out.print("Descending order: ");
        for(int i=names.length-1; i>=0; i--){
            System.out.print(names[i]+" ");
        }
    }
}
