public class EvenDigitSum {
    // write code here
    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;
        }
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0){
                sum = sum + digit;
            }
            number /= 10;
        } 
        return sum;
    }
    public static void main(String[] args) {
        int a = getEvenDigitSum(252);
        int b = getEvenDigitSum(123456789);
        System.out.println(a);
        System.out.println(b);
    }
}