

import java.util.Arrays;
import java.util.Scanner;

public class sortArray{
    public static int[] getIntegers (int size) {
        Scanner sc = new  Scanner(System.in);
        int[] number =  new int[size];
        System.out.println("Enter " + size + " contents ");
        for ( int i = 0; i < size ; i++){
            number[i] = sc.nextInt();
        }
        return number;
    }
    public static void printArray(int[] number){
        for(int i = 0; i < number.length; i++ ){
            System.out.println("Element " + i + " contents " + number[i]);
        }
    }

    public static int[] sortIntegers(int[] numbers) {
        
        int[] sortedNumbers = Arrays.copyOf(numbers, numbers.length);
        
        Arrays.sort(sortedNumbers);
        
        for (int i = 0; i < sortedNumbers.length / 2; i++) {
            int temp = sortedNumbers[i];
            sortedNumbers[i] = sortedNumbers[sortedNumbers.length - 1 - i];
            sortedNumbers[sortedNumbers.length - 1 - i] = temp;
        }
        return sortedNumbers;
    }
    public static void main(String[] args) {
        int[] myNumbers = getIntegers(5);
        System.out.println("Original array:");
        printArray(myNumbers);

        int[] sortedNumbers = sortIntegers(myNumbers);
        System.out.println("Sorted array in descending order:");
        printArray(sortedNumbers);
    }
}



    
 