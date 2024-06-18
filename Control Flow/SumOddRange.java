public class SumOddRange {
    // write code here
    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;
        }
        return number % 2 != 0;
    }

    // Method to sum all odd numbers in a given range
    public static int sumOdd(int start, int end) {
        if (start > end || start <= 0 || end <= 0) {
            return -1;
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
       boolean number = isOdd(10);
       System.out.println(number);
       int number2 = sumOdd(1, 121);
       System.out.println(number2);
    }
}