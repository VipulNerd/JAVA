
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        if (A.toLowerCase().length() > 50) {
            System.out.println("Ivalid String");
        }

        StringBuilder reverse = new StringBuilder();

        for (int i = A.length() - 1; i >= 0; i--) {
            reverse.append(A.charAt(i));
        }

        if (reverse.toString().equals(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
