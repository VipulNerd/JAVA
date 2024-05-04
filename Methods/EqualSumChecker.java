public class EqualSumChecker {
    // write code here
    public static boolean hasEqualSum (int num1, int num2, int num3){
        int numberSum = (num1 + num2);
        if (numberSum == num3){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        boolean Number1 = hasEqualSum(1, 2, 2);
        System.out.println(Number1);
        boolean Number2 = hasEqualSum(2, 2, 2);
        System.out.println(Number2);
        boolean Number3 = hasEqualSum(1, 2, 3);
        System.out.println(Number3);

    }
}