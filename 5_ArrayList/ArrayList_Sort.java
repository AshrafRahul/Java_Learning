import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Sort {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        number.add(10);
        number.add(-5);
        number.add(541);
        number.add(11);
        number.add(-874);
        System.out.println("Before sorting: "+number);


        //for ascending
        Collections.sort(number);
        System.out.println("After sorting in ascending order: "+number);

        Collections.sort(number, Collections.reverseOrder());
        System.out.println("After sorting in descending order: "+number);
    }
}
