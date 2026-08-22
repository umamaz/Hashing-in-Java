//Given an array of integers nums and an integer k, return the total number of continuous subarrays whose sum equals k.

import java.util.HashMap;
import java.util.Map;

public class SumArray {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0, 1); // empty prefix, handles subarrays starting at index 0

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;

            // if (sum - k) exists, those prefixes mark subarrays that sum to k
            if (prefixCount.containsKey(sum - k)) {
                count += prefixCount.get(sum - k);
            }

            // record current prefix sum
            prefixCount.put(sum, prefixCount.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
    

