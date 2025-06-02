
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         while(true){
            String value = scanner.nextLine();
            String[] array = value.split(" ");
            
            System.out.println(array[array.length-1]);
            
            if (value.equals("")) {
                break;
            }
        }
    }
}
            


