
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        if (A.toLowerCase().length() > 50) {
            System.out.println("Ivalid String");
        }

        String reverse = "";

        for (int i = A.length() - 1; i >= 0; i--) {
            reverse = reverse + A.charAt(i);
        }

        if (reverse.equals(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
