
import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        if ((a.length() < 0) && (a.length() > 50)) {
            System.out.println("Invalid Input");
        }

        if ((b.length() < 0) && (b.length() > 50)) {
            System.out.println("Invalid Input");
        }
        a = a.toLowerCase();
        char[] arr1 = a.toCharArray();
        Arrays.sort(arr1);
        a = new String(arr1);

        b = b.toLowerCase();
        char[] arr2 = b.toCharArray();
        Arrays.sort(arr2);
        b = new String(arr2);

        if (b.equals(a)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
