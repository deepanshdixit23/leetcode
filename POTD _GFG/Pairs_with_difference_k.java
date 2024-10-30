/**
 * Pairs-with-difference-K
 */
import java.util.*;

 class Solution {
    int countPairsWithDiffK(int[] arr, int k) {
         HashMap<Integer, Integer> countMap = new HashMap<>();
        
        // Count occurrences of each number
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int ans = 0;

        // Iterate through the map
        for (int num : countMap.keySet()) {
            // Check for num + k
            if (countMap.containsKey(num + k)) {
                ans += countMap.get(num) * countMap.get(num + k);
            }
            // Check for num - k
            if (countMap.containsKey(num - k)) {
                ans += countMap.get(num) * countMap.get(num - k);
            }
        }

        return ans/2;
    }
}
public class Pairs_with_difference_k {

    public static void main(String[] args) {
        Solution sol = new Solution();

        int arr[] = {1,5,3,4,2};
         int k = 3;

        System.out.println(sol.countPairsWithDiffK(arr,k));


    }
    
}