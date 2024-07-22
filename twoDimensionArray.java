import java.util.Scanner;
public class twoDimensionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns respectively:");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] arr= new int[rows][columns]; 
        int size =0;
        System.err.println("Enter elements");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter a number to search: ");
        int x = sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(arr[i][j] == x){
                    System.out.println("number found at: " +i+"x"+j);
                }
            }
        }
    }
}
