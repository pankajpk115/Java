import java.util.Scanner;

public class bodymass {
        public static double  calculateBMI(double x, double y) {
        return (x / (y * y));
    }
    public static void main(String  args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Weight KG");
        double weight = sc.nextDouble();
        System.out.println("Enter your height in MT");
        double height = sc.nextDouble();
        double calc = calculateBMI(weight, height);
        System.out.println(calc);

        if(calc<18.5){
            System.out.println("You are Underweight!!");
        }
        else if(calc>=18.5 && calc <24.9){
            System.out.println("You are Normal!!");
        }
        else{
            System.out.println("You are Obese!!");
        }

    }
}
