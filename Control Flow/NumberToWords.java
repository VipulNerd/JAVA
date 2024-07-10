public class NumberToWords {
    public static  int reverse(int number){
        int reversedNumber = 0;
        while(number != 0){
            int lastDigit = number % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            number /= 10;
        } 
        return reversedNumber;
    }
    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Number");
        }
        if (number == 0) {
            System.out.print("Zer");
            return;
        }
        int reversedNumber = reverse(number);
        int originalDigitCount = getDigitCount(number);
        int originalReverseDigitCount = getDigitCount(reversedNumber);
        
        while(reversedNumber > 0){
            int digitForWord = reversedNumber%10;
            reversedNumber /= 10;
            switch(digitForWord){
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }
        }
        for (int i = 0; i < (originalDigitCount - originalReverseDigitCount); i++){
            System.out.println("Zero");
        }
    }
    public static int getDigitCount(int number){
        if (number < 0){
            return -1;
        }
        if (number == 0){
            return 1;
        }
        int count = 0;
        while (number > 0){
            number /= 10;
            count++;
        }return count;
    }
    public static void main(String[] args) {
       numberToWords(0);
       numberToWords(987);
    }

}
