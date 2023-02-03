public class UnaryOperator {
    public static void main(String[] args) {
        int x=10, result;
        //unary plus
        result = +x;
        System.out.println("Result: "+result);

        //unary minus
        result = -x;
        System.out.println("Result: "+result);
        
        System.out.println();
        //increament and decreament
        int m,n,o,p,q;
        int a=10;
        
        m=a++;
        n=++a;
        o=--a;
        p=a--;
        q=a;
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);
        System.out.println(p);
        System.out.println(q);

    }
}
