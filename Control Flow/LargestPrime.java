public class LargestPrime {
    public static int getLargestPrime(int number){
        if (number <= 1){
            return -1;
        }
        int prime = 0;
        for (int i=2; i<= number; i++){
            while(number%i == 0){
                prime = i;
                number /= i;
            }
        }return prime;
        
    }
    public static void main(String[] args) {
        int a = getLargestPrime(217);
        System.out.println(a);
    }
}
