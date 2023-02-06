public class string_primitive {
    public static void main(String[] args) {
        //primitive to string
        int i = 100;
        String s = Integer.toString(i);
        System.out.println(s);

        double i1 =10.25;
        String s1 = Double.toString(i1);
        System.out.println(s1);

        //string to primitive
        String st = "32";
        int i3 = Integer.parseInt(st);
        System.out.println(i3);

        int i4 = Integer.valueOf(st);
        System.out.println(i4);
    }
}
