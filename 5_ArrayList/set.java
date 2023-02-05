import java.util.ArrayList;

public class set {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();

        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);

        System.out.println("ArrayList contain: "+number);
        System.out.println();

        number.set(3, 50);
        System.out.println("After set, ArrayList contain: "+number);
    }
}
