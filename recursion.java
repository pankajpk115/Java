public class recursion {
    public static void printNum(int i,int x,int sum){
        if(i==x){
            sum+=i;
            System.err.println(sum);
            return;
        }
        sum +=i;
        printNum(i+1,x,sum);
    }
    public static void main(String[] args) {
        // int n = 1;
        printNum(1,6,0);
    }
}
