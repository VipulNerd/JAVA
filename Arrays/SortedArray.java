package Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class SortedArray{
    public static int[] getIntegers (int size) {
        Scanner sc = new  Scanner(System.in);
        int[] number =  new int[size];
        System.out.println("Enter " + size + "contents");
        for ( int i = 0; i < size ; i++){
            number[i] = sc.nextInt();
        }
        return number;
    }
    public static void printArray(int[] number){
        for(int i = 0; i < number.length; i++ ){
            System.out.println("Element" + i + "contents" + number[i]);
        }
    }

    public static int[] sortIntegers(int[] number){
        int[] num = new int[number.length];
        Arrays.sort(number);
        for ( int j = number.length; j >= 0; j--){
            System.out.println(number[j] + " "); 
        }
        return number;
    }
    public static void main(String[] args) {
        getIntegers(5);
     }
}



    
 