
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String value = scanner.nextLine();
            String[] splitStringArray = value.split(" ");

            for (String e : splitStringArray) {
                if(e.contains("av")){
                    System.out.println(e);
                }
            }
            if(value.equals("")){
                break;
            }
        }
    }
}
                
           
        
        
        
        

