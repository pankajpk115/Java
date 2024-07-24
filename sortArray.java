public class sortArray {
    public static boolean sorted(int arr[], int first) {
        if (arr[first] == arr.length) {
            return true;
        }
        if (arr[first] < arr[first + 1]) {
            return sorted(arr, first + 1);
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5 ,6};
       System.out.println( sorted(arr, 0));
    }
}
