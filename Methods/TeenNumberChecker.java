public class TeenNumberChecker {
    // write code here
    public static boolean hasTeen (int num1, int num2, int num3){
        if((num1 >= 13) && (num1 <= 19)){
            return true;
        }else if ((num2 >= 13) && (num2 <= 19)){
            return true;
        }else if ((num3 >= 13) && (num3 <= 19)){
            return true;
        }
        return false;
    }
    public static boolean isTeen (int num4){
        if((num4 >= 13) && (num4 <= 19)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        boolean Teen1 = hasTeen(15, 16, 18);
        System.out.println(Teen1);
        boolean Teen2 = hasTeen(15, 10, 18);
        System.out.println(Teen2);
        boolean Teen3 = isTeen(15);
        System.out.println(Teen3);
        boolean Teen4 = isTeen(10);
        System.out.println(Teen4);
        

    }
}