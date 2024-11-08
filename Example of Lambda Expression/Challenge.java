
import java.util.Arrays;
import java.util.function.Consumer;

;

public class Challenge {

    public static void main(String[] args) {
        Consumer<String> printTheParts = new Consumer<String>() {

            @Override
            public void accept(String sentence) {
                String[] parts = sentence.split(" ");
                for (String part : parts) {
                    System.out.println(part);
                }
            }
        };

        Consumer<String> printTheLambda = sentence -> {
            String[] parts = sentence.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };

        printTheParts.accept("Lets split");
        System.out.println("---------");
        printTheLambda.accept("Lets split");
        System.out.println("---------");

        Consumer<String> printTheLambda2 = sentence -> {
            String[] parts = sentence.split(" ");
            Arrays.asList(parts).forEach(s -> System.out.println(s));
        };

        printTheLambda2.accept("Lets split");
        System.out.println("---------");

        Consumer<String> printTheCoincise = sentence -> {

            Arrays.asList(sentence.split(" ")).forEach(s -> System.out.println(s));
        };

        printTheCoincise.accept("Lets split the bill");
    }
}
