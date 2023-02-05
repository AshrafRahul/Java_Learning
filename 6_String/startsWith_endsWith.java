public class startsWith_endsWith {
    public static void main(String[] args) {
        String name = "Ashraful";

        boolean start = name.startsWith("A");
        boolean start2 = name.startsWith("k");
        boolean end = name.endsWith("l");
        boolean end2 = name.endsWith("d");

        System.out.println(start);
        System.out.println(start2);
        System.out.println(end);
        System.out.println(end2);
    }
}
