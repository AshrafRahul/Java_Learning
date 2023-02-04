import java.util.ArrayList;

public class removing_elements {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();

        number.add(10);
        number.add(20);
        number.add(2, 30);
        System.out.println("ArrayList contain: "+number);

        number.remove(1);
        System.out.println("After removing, ArrayList contain: "+number);

        number.removeAll(number);
        System.out.println("After removing all: "+number);
    }
}
