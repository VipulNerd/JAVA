public class SharedDigit {
    // write code here
    public  static boolean hasSharedDigit (int num1, int num2){
        
      while(((num1 >= 10)&&(num1<=99))&&((num2 >= 10)&&(num2<=99))){
        int digit1 = num1%10;
        int digit2 = num2%10;
        num1 /= 10;
        num2 /= 10;
        if((digit1 == digit2)||(num1 == num2)){
            return true;
        }else if ((digit1 == num2)||(digit1 == num1)){
            return true;
        }return false;
      }return false;
    }
    public static void main(String[] args) {
        boolean a = hasSharedDigit(12, 21);
        boolean b = hasSharedDigit(9, 99);
        boolean c = hasSharedDigit(15, 55);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}