public class equals {
    public static void main(String[] args) {
        String s1 = "Ashraful Islam";
        String s2 = new String("Ashraful Islam");

        if(s1.equals(s2)){
            System.out.println("Equals");
        }
        else{
            System.out.println("Not equals");
        }
    }
}
