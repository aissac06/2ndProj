public class WordCount {
    public static int countWords(String input) {
    if (input == null || input.isEmpty()) {
        return 0;
    }


    String[] words = input.split("[^A-Za-z]+");

    int count = 0;
    for (String w : words) {
        if (!w.isEmpty()) {
            count++;
        }
    }

    return count;
}
    public static void main(String[] args) {
        System.out.println(countWords("Hello, world!"));
    }
}
