import java.util.*;

public class temp {
    public static void main(String[] args) {
        int [] arr = {34,3,22,42,24,2,42,242,42,24,24,24,24,21,3,424,53453,35,35};

        HashMap<Integer, Integer> countMap = new HashMap<>();
        
        // Count occurrences of each number
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        System.out.println(countMap);

    }
}
