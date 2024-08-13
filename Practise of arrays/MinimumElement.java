import java.util.Scanner;

public class MinimumElement {
    public static int readInteger(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements to enter");
        int size =  input.nextInt();
        return size;
    }

    public static int[] readElements(int size){
        Scanner element = new Scanner(System.in);
        int[] array = new int[size];
        System.out.println("Enter Elements of array:");
        for( int i = 0 ; i < size; i++ ){
           array[i] = element.nextInt();
        }
        System.out.println("Array of given size and element: " + array);
        return array;

    }

    public static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for ( int i = 0;  i < array.length; i++ ){
            int ele = array[i] ;
            if (ele < min){
                min = ele;
            }
            return min;
        }
        return min;
    } 
    
    public static void main(String[] args) {
        int size = readInteger();
        int[] firstArray = readElements(size);
        int minimumElement = findMin(firstArray);
        System.out.println("Minimum Element in given arry:" + minimumElement);
    }
    
}
