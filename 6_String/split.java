public class split {
    public static void main(String[] args) {
        String s1 = "This is my country";
        System.out.println("Before split: "+s1);

        System.out.println();
        System.out.println("After split: ");
        String[] s2 = s1.split(" ");
        for(String x: s2){
            System.out.println(x);
        }
    }
}
