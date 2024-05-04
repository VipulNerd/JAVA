public class LeapYear {
    // write code here
    public static boolean isLeapYear(int year){
        if (year <= 0 || year > 9999){
            return false;
        }else if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        boolean Year = isLeapYear(2024);
        System.out.println(Year);
    }
}