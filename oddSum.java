import java.util.Scanner;

public class oddSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total elements in array: ");
        int n = sc.nextInt();
        System.out.print("Enter Elements of array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // int array[] = {1,2,3,4,5,6};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }
        System.err.println(sum);
    }
}
