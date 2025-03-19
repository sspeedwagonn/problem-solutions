package hackerRank.longestSubString;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {
    public int lengthOfLongestSubstring(String s) {
        int maxL = 0;
        Map<Character, Integer> seen = new HashMap<>();
        for (int r = 0, l = 0; r < s.length(); r++) {
            char current = s.charAt(r);
            if (seen.containsKey(current) && seen.get(current) >= l) {
                l = seen.get(current) + 1;
            }
            maxL = Math.max(maxL, r - l +1);
            seen.put(current, r);
        }

        return maxL;
    }
}
