import java.util.ArrayList;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(4, 50);

        Iterator itr = number.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
}
