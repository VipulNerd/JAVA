public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if (number < 0){
            return -1;
        }
            int lastDigit = number%10;
            int firstDigit = number;
            while (firstDigit >=10){
                firstDigit /= 10;
            }return firstDigit + lastDigit;
    }
    public static void main(String[] args) {
        int a = sumFirstAndLastDigit(100);
        int b = sumFirstAndLastDigit(7);
        int c = sumFirstAndLastDigit(998);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
