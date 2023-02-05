public class equalsIgnoreCase {
    public static void main(String[] args) {
        String s1 = "ashraful Islam";
        String s2 = new String("Ashraful Islam");

        if(s1.equalsIgnoreCase(s2)){ //it ignore lower/uppercase
            System.out.println("Equals");
        }
        else{
            System.out.println("Not equals");
        }
    }
}
