public class BarkingDog {
    // write code here
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if ((hourOfDay < 0) || (hourOfDay > 23)){
            return false;
        }else if ((hourOfDay < 8) && (barking == true)) {
            return true;
        }else if ((hourOfDay > 22) && (barking == true)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        boolean Wake = shouldWakeUp(false, 6);
        System.out.println(Wake);
    }
}