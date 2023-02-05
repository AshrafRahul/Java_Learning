import java.util.ArrayList;

public class indexOf {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();

        number.add(10);
        number.add(20);
        number.add(30);

        int pos = number.indexOf(20);
        System.out.println("Index of the number is: "+pos);
    }
}
