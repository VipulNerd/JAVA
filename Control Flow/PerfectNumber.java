public class PerfectNumber {
    // write code here
    public static boolean isPerfectNumber(int number){
        if (number < 1){
            return false;
        }
        int sum = 0;
        for(int i = 1; i < number; i++){
            if(number%i  == 0){
                sum += i;
                if (sum == number){
                    return true;
                }
            }
        }return false;
    }
    public static void main(String[] args) {
        boolean a = isPerfectNumber(28);
        System.out.println(a);
        boolean b = isPerfectNumber(6);
        System.out.println(b);
        boolean c = isPerfectNumber(5);
        System.out.println(c);
    }
}