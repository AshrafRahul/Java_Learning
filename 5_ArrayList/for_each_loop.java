import java.util.ArrayList;

public class for_each_loop {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(10);
        number.add(20);
        number.add(2, 30);

        for(int x: number){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
