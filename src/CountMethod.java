public class CountMethod {
    public static int countVowels(String input) {
    int count = 0;
    String vowels = "aeiouAEIOU";

    for (int i = 0; i < input.length(); i++) {
        if (vowels.indexOf(input.charAt(i)) != -1) {
            count++;
        }
    }
    return count;
}

    public static void main(String[] args) {

        // Call the method and store the result
        int result = countVowels("Hello World");

        // Use the result
        System.out.println("Number of vowels: " + result);



    }

}
