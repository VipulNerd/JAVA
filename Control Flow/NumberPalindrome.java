public class NumberPalindrome {
    // write code here
    public static boolean isPalindrome(int number){
        int num = number;
        int reverse = 0;
        number = Math.abs(number);
        while(number >0){
            int lastDigit = number%10;
            reverse = (reverse*10)+lastDigit;
            number = number/10;
        }
        return num == reverse || num == -reverse;
        
    }
    public static void main(String[] args) {
       boolean a = isPalindrome(-1221);
        boolean b = isPalindrome(1001);
        boolean c = isPalindrome(100);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}