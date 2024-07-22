import java.util.Scanner;

public class average {
        public static int average(int a, int b, int c){
        return(a+b+c)/3;
        // return average;
    }
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter Three numbers to find average: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        System.out.println("The average of numbers is:"+average(x, y, z));;
    }
}
