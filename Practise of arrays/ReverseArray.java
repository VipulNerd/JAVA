import java.util.Arrays;

public class ReverseArray {
    private static void reverse(int[] array){
        System.out.println("Array = " + Arrays.toString(array));
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        
        for( int i = 0; i < array.length; i++){
            arrayCopy[i] = array[array.length - 1 - i];
        }
        System.out.println("Reversed array = " + Arrays.toString(arrayCopy));

    }
    public static void main(String[] args) {
        int[] firstArray = {1,2,3,4,5};
        reverse(firstArray);
    }
}
