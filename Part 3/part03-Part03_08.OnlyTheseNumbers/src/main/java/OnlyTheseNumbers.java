
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        
        System.out.println("From where?");
        int num1 = scanner.nextInt();
        System.out.println("Where to?");
        int num2 = scanner.nextInt();
        for(int index = num1;index<=num2;index++){
            if(index>=0 && index<numbers.size()){
                System.out.println(numbers.get(index));
            }
            
        
        
        }
        

    }
}
