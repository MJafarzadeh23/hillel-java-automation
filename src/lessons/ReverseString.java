package lessons;

public class ReverseString {
    public static void main(String[] args) {
        String toReverse = "Maria Jafarzadeh";
        String reverseName = "Maria";
        System.out.println(reverseString(reverseName));
    }

    public static String reverseString(String toReverse) {
        String result = "";

        for (int i = toReverse.length() - 1; i >= 0; i--) {
            result += toReverse.charAt(i);
        }
        return result;
    }
}
