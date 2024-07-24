public class reverseString {
    public static void reverse(String str, int index){
        if(index < 0){
            // System.err.println(str.charAt(0));
            return;
        }
        // reverse(str, index);
        System.out.println(str.charAt(index));
        reverse(str, index-1);
    }
    public static void main(String[] args) {
        String str = "abcd";
        int index = str.length()-1;
        reverse(str, index);
    }
}
