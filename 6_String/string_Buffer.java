public class string_Buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Ashraful");
        System.out.println(sb);

        sb.append(" Islam");
        sb.append(" 22");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.setLength(10);
        System.out.println(sb);
        
        sb.delete(0,5);
        System.out.println(sb);

    }
}
