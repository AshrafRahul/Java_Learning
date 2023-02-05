import java.util.ArrayList;

public class equals {
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

        boolean result1 = n1.equals(n2);
        System.out.println("Number1 == Number2 ? : "+result1);

        boolean result2 = n1.equals(n3);
        System.out.println("Number1 == Number3 ? : "+result2);

        boolean result3 = n2.equals(n3);
        System.out.println("Number2 == Number3 ? : "+result3);
    }
}
