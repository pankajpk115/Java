import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;


public class diff {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int n = sc.nextInt();
        System.out.print("Enter Elements of array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        ArrayList<Integer> negative = new ArrayList<>(n);
        ArrayList<Integer> positive = new ArrayList<>(n);
        ArrayList<Integer> zeroes = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                negative.add(arr[i]);
            }
            else if(arr[i]>0){
                positive.add(arr[i]);
            }
            else{
                zeroes.add(arr[i]);
            }
        }
        System.err.println(negative);
        System.err.println(positive);
        System.err.println(zeroes);
    }
}
