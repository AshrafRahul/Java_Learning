public class String_builder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Ashraful");
        System.out.println(str);

        str.append(" Islam");
        str.append(" 22.5");
        System.out.println(str);

        str.reverse();
        System.out.println(str);

        str.delete(5, 9);
        System.out.println(str);
    }
}