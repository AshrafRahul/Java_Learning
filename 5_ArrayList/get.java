import java.util.ArrayList;

public class get {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();

        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);

        int x = number.get(2);
        System.out.println("Number in this index: "+x);
    }
}
