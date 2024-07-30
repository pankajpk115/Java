public class duplicates {
    public static boolean map[] = new boolean[26];

    public static void dup(String str, int i, String newString) {
        // String newString="";
        if (i == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(i);

        if (map[currChar - 'a']) {
            dup(str, i + 1, newString);
        } else {
            newString += currChar;
            map[currChar - 'a'] = true;
            dup(str, i + 1, newString);
        }

    }

    public static void main(String[] args) {
        String str = "abbccda";
        dup(str, 0, "");
    }
}
