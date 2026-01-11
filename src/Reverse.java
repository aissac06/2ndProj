public class Reverse {
    public static String reversed(String input) {
    String reversed = "";
    for (int i = input.length() - 1; i >= 0; i--) {
        reversed += input.charAt(i);
    }
    return reversed;
}

    public static void main(String[] args) {
        System.out.println(reversed("Hello"));
    }



}
