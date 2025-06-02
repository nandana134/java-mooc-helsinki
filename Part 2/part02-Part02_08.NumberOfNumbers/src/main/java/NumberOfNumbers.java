
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = 0;
        int no;
        
        while (true) {
            System.out.println("Give a number:");
            no = scanner.nextInt();
            if (no == 0) {
                break;
            }
            numbers++;
        }
        
        System.out.println("Number of numbers: " + numbers);
        scanner.close();
    }
}

 
   
        
        
        
        
        
        
        
        
        
        
        
        

  