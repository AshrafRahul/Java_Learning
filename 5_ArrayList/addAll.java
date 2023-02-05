import java.util.ArrayList;

public class addAll {
    public static void main(String[] args) {
        ArrayList<Integer> n1 = new ArrayList<>();
        ArrayList<Integer> n2 = new ArrayList<>();
        ArrayList<Integer> n3 = new ArrayList<>();

        n1.add(10);
        n1.add(20);
        n1.add(30);
        n1.add(40);
        System.out.println("Number1: "+n1);

        n2.add(1);
        n2.add(2);
        n2.add(3);
        n2.add(4);
        System.out.println("Number2: "+n2);

        n3.addAll(n1);
        System.out.println("Number3: "+n3);
        
        
    }
}
