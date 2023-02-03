public class for_each_loop{
    public static void main(String[] args) {
        int[] num = {10,20,30,40,50};
        int sum =0;

        for(int x : num){
            sum = sum+x;
        }
        System.out.println(sum);
    }
}