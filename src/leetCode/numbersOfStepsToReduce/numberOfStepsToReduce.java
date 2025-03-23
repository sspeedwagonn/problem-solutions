package leetCode.numbersOfStepsToReduce;

public class numberOfStepsToReduce {
    public int numberOfSteps(int num) {
        int stepsTaken = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }

            stepsTaken++;
        }

        return stepsTaken;
    }
}
