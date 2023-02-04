import java.util.ArrayList;

public class Array_list1 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("Size: "+number.size());

        //adding elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(4, 50);
        System.out.println(number);
        System.out.println("Size: "+number.size());
    }
}
