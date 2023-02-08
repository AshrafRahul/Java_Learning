import java.util.Random;

public class randomNumber2 {
    public static void main(String[] args) {
        Random rand = new Random();

        int randomNumber = (int) (Math.random()*10); //0 to 10
        System.out.println(randomNumber);
    }
}
