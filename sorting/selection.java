package sorting;

public class selection {
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.err.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };

        for (int i = 0
        ; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        print(arr);
    }
}
