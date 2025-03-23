package hackerRank.algorithms;

import java.util.List;

public class SimpleArraySum {
    public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        for (Integer integer : ar) {
            sum += integer;
        }
        return sum;
    }
}