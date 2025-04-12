package leetCode.scoreOfAString;

public class ScoreOfAString {
    public int scoreOfString(String s) {
        int solution = 0;
        char[] c = s.toCharArray();

        for (int i = 0; i < s.length() - 1; i++) {
            solution += Math.abs(c[i] - c[i + 1]);
        }

        return solution;
    }
}
