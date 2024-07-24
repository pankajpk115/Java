public class replaceX {
    public static void replace(String str,int index, int count, String newString){
        if(index == str.length()-1){
            for(int i =0 ;i<count;i++){
                newString += "x";
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);
        if(currChar == 'x'){
            count++;
            replace(str, index+1, count, newString);
        }
        else{
            newString += currChar;
            replace(str, index+1, count, newString);
        }
    }
    public static void main(String[] args) {
        String str = "axbxcxxdx";
        replace(str, 0, 0, "");
    }
}
