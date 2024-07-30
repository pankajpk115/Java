public class backtracling {
    public static void printPermutation(String str, String newString, int idx){
        if(str.length()==0){
            System.out.println(newString);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPermutation(newStr, newString+currChar, idx+1);
        }
    }
    public static void main(String[] args) {
        String str = "ABCD";
        printPermutation(str, "", 0);
    }
}
