public class keypad {
    public static String[] keys = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printComb(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keys[currChar - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            printComb(str, idx + 1, combination + mapping.charAt(i));
        }
    }

    public static int count(String str) {
        int count = 1;
        for (int i = 0; i < str.length()-1  ; i++) {
            if (str.charAt(i) == str.charAt(i+1)) {
                count +=1;
            } else  {
                // System.out.println("Count of " + str.charAt(i) + " is " + count);
                count = 1;
            }
            // count(str);
            System.out.println("Count of " + str.charAt(i) + " is " + count);
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "3322232";
        System.out.println(count(str));
        // printComb(str, 0, "");
    }
}
