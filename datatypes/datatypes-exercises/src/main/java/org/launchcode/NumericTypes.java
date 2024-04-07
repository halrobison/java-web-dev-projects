package java.org.launchcode;
import java.util.Scanner;

public class NumericTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert length of rectangle: ");
        Integer length = input.nextInt();

        System.out.println("Insert width of rectangle: ");
        Integer width = input.nextInt();

        Integer area = length * width;

        System.out.println("The area of the rectangle is: " + area);
    }
}
