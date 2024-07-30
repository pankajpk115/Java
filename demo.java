public class demo {
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // If one kangaroo starts ahead and jumps farther or equally, they will never meet
        if (v1 == v2) {
            if (x1 == x2) {
                return "YES";
            } else {
                return "NO";
            }
        }
        
        // Check if they ever land on the same position
        int diff = x2 - x1;
        int jumpDiff = v1 - v2;
        
        if (diff % jumpDiff == 0 && diff / jumpDiff >= 0) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        System.out.println(kangaroo(0, 3, 4, 2)); // Output should be "YES"
        System.out.println(kangaroo(0, 2, 5, 3)); // Output should be "NO"
    }
}
