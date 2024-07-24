public class findOccurance {
    public static int first = -1;
    public static int last = -1;

    public static void findOccuranc(String str,int index,char element){
        if(index == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(index);
        if(currChar == element){
            if(first == -1){
                first = index;
            }
            else{
                last = index;
            }
        }
        findOccuranc(str, index+1, element);
    }
    public static void main(String[] args) {
        String str = "a";
        findOccuranc(str,0,'a');
    }
}
