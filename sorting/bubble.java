package sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class bubble {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {7,8,3,1,2};
        // int n = ;
        // System.err.println(n);

        for(int i=0; i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                // System.err.println(arr);
            }
        }
        print(arr);
    }
}
