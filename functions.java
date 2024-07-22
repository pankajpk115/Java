
// import java.io.Console;
import java.io.Console;
import java.lang.reflect.Array;
// Average of 3 numbers
import java.util.*;

public class functions {

    public static int search(int[] arr , int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                System.err.println("Number found in array at index :"+i);
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter total number of elements: ");
        int size = sc.nextInt();
        System.err.println("Enter a number to search for: ");
        int x = sc.nextInt();
        int [] arr = new int[size];
        for(int i=0; i<size;i++){
            arr[i] = sc.nextInt();
        }
        search(arr,x);
    }
}
