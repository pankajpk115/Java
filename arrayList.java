import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // //add
        // list.add(1);
        // list.add(2);
        // list.add(3);

        // System.out.println(list);

        // //add to particular index
        // list.add(3,4);

        // System.out.println(list);
        // //set index value
        // list.set(0, 5);
        // System.out.println(list);

        // //remove from index
        // list.remove(0);
        // System.out.println(list);

        // //iterate through list
        // for(int n : list){
        //     if(n>=2){
        //         System.out.println(n);
        //     }
        // }

        list.add(5);
        list.add(0,4);
        list.add(0,3);
        list.add(0,2);
        list.add(0,1);

        System.out.println(list);
    }
}
