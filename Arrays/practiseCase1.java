package Arrays;

import java.util.Arrays;

public class practiseCase1{
    public static void main(String[] args) {
        int[] firstArray = {20,23,44,56,23,85,58,99};
        int[] secondArray = new int[firstArray.length];
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));
        for( int i = firstArray.length -1; i  >= 0; i--){
            System.out.print(firstArray[i] + " ");
        }
        for (int i = 0; i < firstArray.length; i++){
            secondArray[i] = firstArray[firstArray.length  - 1-i];
            System.out.print(secondArray[i] + " ");
        }
        
    }
}