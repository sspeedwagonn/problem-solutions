package leetCode.reverseDegree;

public class ReverseDegreeString {
    public int reverseDegree(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int reverse = 26 - (c - 'a');
            result += reverse * (i + 1);
        }

        return result;
    }
}
