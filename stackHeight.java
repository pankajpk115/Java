public class stackHeight {
    public static int calc(int x ,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int pow = calc(x,n-1);
        int h =x*pow;
        return h;
    }
    public static void main(String[] args) {
        int x = 2, n= 5;
        // calc(2, 5);
        int result = calc(x,n);
        System.out.println(result);
    }
}
