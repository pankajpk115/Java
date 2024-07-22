import java.util.Scanner;

public class fibonacci {
    // static void Fibonacci(int n) {
    //     int num1 = 0, num2 = 1;

    //     for (int i = 0; i < n; i++) {
    //         // Print the number
    //         System.out.print(num1 + " ");

    //         // Swap
    //         int num3 = num2 + num1;
    //         num1 = num2;
    //         num2 = num3;
    //     }
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.err.println("Enter a number: ");
    //     int n = sc.nextInt();
    //     Fibonacci(n);
    // }




    //fibo by recursion

    public static void fibo(int a,int b,int n){
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        fibo(b, c, n-1);
    }
    public static void main(String[] args) {
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        fibo(0,1,5);
    }
}
