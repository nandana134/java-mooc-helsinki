
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string:");
        String text = scanner.nextLine();
        System.out.println("Give an integer:");
        int integer = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double floatingPoint = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean trueOrFalse = Boolean.valueOf(scanner.nextLine());
        
        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + integer);
        System.out.println("You gave the double " + floatingPoint);
        System.out.println("You gave the boolean " + trueOrFalse);


        // Write your program here

    }
}
