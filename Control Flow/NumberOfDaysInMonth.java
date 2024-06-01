public class NumberOfDaysInMonth {
    // write code here

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        switch (month) {
            case 1:  // January
            case 3:  // March
            case 5:  // May
            case 7:  // July
            case 8:  // August
            case 10: // October
            case 12: // December
                return 31;
            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11: // November
                return 30;
            case 2:  // February
                return isLeapYear(year) ? 29 : 28;
            default:
                return -1;
        }
    }
    public static void main(String[] args) {
       int month2 = getDaysInMonth(2, 2020);
       System.out.println("day in month 2 : " + month2 + " days");
       int month1 = getDaysInMonth(1, 2020);
       System.out.println("day in month 1 : " + month1 + " days");
    }
}

