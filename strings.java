public class strings {
    public static void main(String[] args) {
        // String str1 = "Pankaaaj";
        // String str2 = "Pankaaj";
        // String sentence = "My name is Pankaj";
        // if(str1.compareTo(str2) == 0){
        //     System.err.println("Strings are Equal");
        // }
        // else if(str1.compareTo(str2)>0){
        //     System.err.println("String 2 is greater");
        // }
        // else{
        //     System.err.println("String 1 is greater");
        // }
        // // for(int i=0;i<str1.length();i++){
        // //     System.err.println(str1.charAt(i));
        // // }
        // System.err.println(sentence.substring(11));

        // StringBuilder sb = new StringBuilder("Pankaj");

        // sb.insert(0,"A");
        // System.err.println(sb);

        // sb.delete(0,1);
        // System.err.println(sb);

        StringBuilder rv= new StringBuilder("hello");
        for(int i =0;i< rv.length()/2 ;i++){
            int front = i;
            int back = rv.length()-1-i;

            char frontChar = rv.charAt(front);
            char backChar = rv.charAt(back);

            rv.setCharAt(front, backChar);
            rv.setCharAt(back, frontChar);
        }
        System.err.println(rv);
    }
}
