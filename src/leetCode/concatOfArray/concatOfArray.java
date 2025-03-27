package leetCode.concatOfArray;

import java.util.Arrays;

public class concatOfArray {
    public int[] getConcatenation(int[] nums) {
        int[] result = Arrays.copyOf(nums, 2 * nums.length);
        System.arraycopy(nums, 0, result, nums.length, nums.length);
        return result;
    }
}
