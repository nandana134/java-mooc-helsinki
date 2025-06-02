
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");
        int greatestNumber = list.get(0);
        for (int num : list){
            if(num>greatestNumber){
                greatestNumber = num;
            }
        }
        System.out.println("The greatest number: " +greatestNumber);

        // implement finding the greatest number in the list here
    }
}
