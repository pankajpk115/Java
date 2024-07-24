public class towerOfHanoi {
    public static void hanoi(int n, String source, String helper, String destination) {
        if (n == 1) {
            System.out.println("transfer disk" + n + " from " + source + " to " + destination);
            return;
        }
        hanoi(n - 1, source, destination, helper);
        System.out.println("transfer disk" + n + " from " + source + " to " + destination);
        hanoi(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {
        int n = 5;
        hanoi(n, "S", "H", "D");
    }
}
