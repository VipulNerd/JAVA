
import java.util.Scanner;

public class MinimumElement {
    private static int readInteger(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter count:");
        int size =  input.nextInt();
        return size;
    }

    private static int[] readElements(int size){
        Scanner element = new Scanner(System.in);
        int[] array = new int[size];
        System.out.println("Enter Elements of array:");
        for( int i = 0 ; i < array.length; i++ ){
            System.out.println("Enter a number:");
            array[i] = element.nextInt();
        }
        return array;

    }

    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for ( int i = 0;  i < array.length; i++ ){
            if (array[i] < min){
                min = array[i];
            }
            
        }
        return min;
    } 
 
    
    public static void main(String[] args) {
        int size = readInteger();
        int[] firstArray = readElements(size);
        int minElement = findMin(firstArray);
        System.out.println("Minimum Element in given arry:" + minElement);
    }
    
}
