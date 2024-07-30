import java.util.HashSet;

public class subsequences {
    public static void sub(String str, int i, String newString, HashSet<String> set) {
        if (i == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }

        }
        char currChar = str.charAt(i);

        sub(str, i + 1, newString + currChar, set);
        sub(str, i + 1, newString, set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        sub(str, 0, "", set);
    }
}
