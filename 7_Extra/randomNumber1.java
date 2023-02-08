import java.util.Random;

public class randomNumber1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(50)+20; //2 to (50+20)
        System.out.println(randomNumber);
    }
}
