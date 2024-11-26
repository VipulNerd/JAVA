
import java.util.Arrays;
import java.util.List;

public class practise {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 2, 9, 1, 6);
        System.out.println(list.stream().map(x -> x * x).sorted().toList());

        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list2.stream().reduce(Integer::sum).get());

        String word = "Hello World";
        // char[] arr = word.toCharArray();

        System.out.println(word.chars().filter(x -> x == 'l').count());
    }
}
