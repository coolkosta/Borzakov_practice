package specificTasks;

import java.util.Arrays;

public class KataEqualSides {
    public static int findEvenIndex(int[] arr) {
        int leftSide = 0;
        int rightSide = Arrays.stream(arr).sum();
        for (int i = 0; i < arr.length; i++) {
            rightSide -= arr[i];
            if (leftSide == rightSide) return i;
            leftSide += arr[i];
        }
        return -1;
    }
}

// https://www.codewars.com/kata/5679aa472b8f57fb8c000047/java