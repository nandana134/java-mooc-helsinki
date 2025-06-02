
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        for(int i = 0;i<array.length;i++){
            if(array[i] == array[0]){
                System.out.print(array[i]);
            }else if(array[i] == array[array.length-1]){
                System.out.print(", " +array[i]);
            }else{
                System.out.print(", " +(array[i]));
            }
            
        }
        
        
    }
}
