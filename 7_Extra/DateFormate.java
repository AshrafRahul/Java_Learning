import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateFormate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        DateFormat dateFormate = new SimpleDateFormat("dd/MM/YYYY");
        String currentDate = dateFormate.format(date);
        System.out.println("Current date: "+currentDate);
    }
}
