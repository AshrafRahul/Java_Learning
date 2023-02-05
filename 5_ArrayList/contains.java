import java.util.ArrayList;

public class contains {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();

        number.add(10);
        number.add(20);
        number.add(30);

        boolean check = number.contains(20);
        System.out.println("The number is in the list: "+check);
    }
}
