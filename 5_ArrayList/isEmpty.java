import java.util.ArrayList;

public class isEmpty {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();

        number.add(10);
        number.add(20);
        number.add(30);

        System.out.println("ArrayList contain: "+number);
        System.out.println("Size: "+number.size());

        number.clear();

        boolean check = number.isEmpty();
        System.out.println("Is ArrayList empty: "+check);
    }
}
