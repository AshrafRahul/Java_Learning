import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double base, height;

        System.out.print("Enter base: ");
        base = input.nextDouble();

        System.out.print("Enter height: ");
        height = input.nextDouble();

        double area = .5*base*height;

        System.out.println("Area of the tringle is: "+area);
        System.out.println();

        double rad;
        System.out.print("Enter radius of a circle: ");
        rad = input.nextDouble();

        double Area = 3.1416*rad;
        System.out.println("Area of the circle is: "+Area);
    }
}
