import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This program is to determine whether the number is odd or even.
 *
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("====EVEN ODD====\n");
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Input Value: ");
            int value = input.nextInt();
            System.out.println("--------------");
            if (value % 2 == 0) {
                System.out.println("The value is Even");
            } else {
                System.out.println("The value is Odd");
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
        input.close();
    }
}