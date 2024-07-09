public class GreatestCommonDivisor {
    // write code here
    public static int getGreatestCommonDivisor(int first, int second){
        if ((first < 10)||(second < 10)){
            return -1;
        }
        int smaller = Math.min(first, second);
        int gcd = 1;
        for (int i = 1; i <= smaller; i++){
            if ((first%i == 0)&&(second%i == 0)){
                gcd = i;
            }
        } 
        return gcd;
    }
    public static void main(String[] args) {
        int num1 = getGreatestCommonDivisor(60, 12);
        System.out.println(num1);
    }
}