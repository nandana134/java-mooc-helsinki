
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numbers = 0;
        while(true){
            System.out.print("Give a number: ");
            int num = scanner.nextInt();
            if(num == 0){
                break;
            }else{
                numbers++;
                sum += num;
            }
        }
        
        if(numbers > 0) {
            double avg = (double) sum / numbers;
            System.out.println("Average of the numbers: " + avg);
        } else {
            System.out.println("No numbers entered.");
        }
    }
}
