import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class count {

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int count = 0;
        
        // Iterate through all possible pairs (i, j) where i < j
        for (int i = 0; i < n-1; i++) {
            if ((ar.get(i) + ar.get(i+1)) % k == 0) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        List<Integer> ar = List.of(1, 3, 2, 6, 1, 2);
        int n = ar.size();
        int k = 3;
        
        int result = divisibleSumPairs(n, k,ar);
        System.out.println(result);
    }
}
