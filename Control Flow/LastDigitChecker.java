public class LastDigitChecker {
    // write code here
    public static boolean hasSameLastDigit (int num1, int num2, int num3){
        while(((num1 >= 10)&&(num1 <= 1000))&&((num1 >= 10)&&(num1 <= 1000))&&((num1 >= 10)&&(num1 <= 1000))){
            int lastDigit1 = num1%10;
            int lastDigit2 = num2%10;
            int lastDigit3 = num3%10;
            if (lastDigit1 == lastDigit2){
                return true;
            }else if (lastDigit1 == lastDigit3){
                return true;
            }else if (lastDigit2 == lastDigit3){
                return true;
            }return false;

        }
        return false;
    }
    public static boolean isValic(int num4){
        while((num4 >= 10)&&(num4 <= 1000)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean a = hasSameLastDigit(41, 22, 71);
        boolean b = hasSameLastDigit(23, 32, 42);
        boolean c = hasSameLastDigit(9, 99, 999);
        boolean d = isValic(69);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
