
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int negativeNumbers = 0;

        while (true) {
            System.out.println("Give a number:");
            int no = scanner.nextInt();

            if (no == 0) {
                break; // Exit the loop when 0 is entered
            }

            if (no < 0) {
                negativeNumbers++; // Count negative numbers
            }
        }

        System.out.println("Number of negative numbers: " + negativeNumbers);
        scanner.close();
    }
}
