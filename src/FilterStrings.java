import java.util.Arrays;
import java.util.List;

public class FilterStrings {
    public static void main(String[] args) {


        List<String> list = Arrays.asList("Apple", "Banana", "Avocado", "Cherry", "Apricot", "Mango");


    List<String> result = list.stream()
            .filter(s -> s.startsWith("A"))
            .map(String::toLowerCase)
            .toList();

        System.out.println(result);
}


}
