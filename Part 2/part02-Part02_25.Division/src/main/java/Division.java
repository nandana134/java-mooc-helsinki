import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = scanner.nextInt();
        int denominator = scanner.nextInt();
        division(numerator,denominator);
    }
    public static void division(int numerator,int denominator){
        System.out.println((float)numerator/denominator);
    }
}

        
        
        
        // Once you have implemented the division method, you can
        // try it out here. Fopr example division(3,5);
        // should print "0.6"

        // division(3, 5);
   