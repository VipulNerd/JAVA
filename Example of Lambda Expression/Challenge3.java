
import java.util.function.Supplier;

public class Challenge3 {

    public static void main(String[] args) {
        Supplier iLoveJava = () -> "I Love Java";
        Supplier iLoveJava2 = () -> {
            return "I Love Java";
        };
        System.out.println(iLoveJava.get());
        System.out.println(iLoveJava2.get());
    }
}
