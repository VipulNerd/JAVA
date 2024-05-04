public class DecimalComparator {
    // write code here
    public static boolean areEqualByThreeDecimalPlaces (double number1, double number2 ){
        int number1Scaled = (int) (number1 * 1000);
        int number2Scaled = (int) (number2 * 1000);
        if (number2Scaled == number1Scaled){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        boolean Number1 = areEqualByThreeDecimalPlaces(2, 4);
        System.out.println(Number1);
        boolean Number2 = areEqualByThreeDecimalPlaces(2, 2);
        System.out.println(Number2);
    }
}