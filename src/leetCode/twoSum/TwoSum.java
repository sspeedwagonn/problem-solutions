package leetCode.twoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer numIndex = numMap.get(nums[i]);
            if (numIndex != null) {
                return new int[]{i, numIndex};
            }
            numMap.put(target - nums[i], i);
        }
        return nums;
    }
}
