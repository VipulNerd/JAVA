public class MinutesToYearsDaysCalculator {
    // write code here
    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        }else{
        long hour = minutes / 60;
        long day = hour / 24;
        long year = day / 365;
        long leftDays = day % 365;
        System.out.println(minutes + " min " + "= " + year + " y" + " and " + leftDays + " d");
        }
    }
    public static void main(String[] args) {
        printYearsAndDays(1000);
    }
    
}