import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        int gcd = 0;
        int smallest;
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            smallest = a;
        } else {
            smallest = b;
        }

        for (int i = 1; i < smallest; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
