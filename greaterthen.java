import java.util.Scanner;

public class greaterthen {
        public static int greaterInteger(int x,int y){
        int greater;
        if(x>y){
            greater = x;
        }
        else{
            greater=y;
        }
        return greater;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.err.println("The greater integer is: "+ greaterInteger(a, b));
    }
}
