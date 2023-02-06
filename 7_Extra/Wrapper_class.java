import java.util.*;

public class Wrapper_class {
    public static void main(String[] args) {
        //primitive -> object
        int x=30;
        Integer y = Integer.valueOf(x);
        System.out.println(y);

        Integer z = x; //Integer.valuOf(x)
        System.out.println(z);

        //object -> primitive
        Double d = new Double(10.25);
        System.out.println(d);
    }
}
