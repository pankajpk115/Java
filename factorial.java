public class factorial {
    public static void fact(int i,int x,int prod){
        if(i==x){
            prod *=i;
            System.err.println(prod);
            return;
        }
        prod *=i;
        fact(i+1, x, prod);
    }
    public static void main(String[] args) {
        fact(1,6,1);
    }
}
