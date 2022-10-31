package week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrepareTest {
    int[] solution(int[] answer) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = {0, 0, 0};
        for (int i = 0; i < answer.length; i++) {
            if (arr1[i] == answer[i]) {
                int count = ++i;
                score[0] = count;
            }
        }
        return score;
    }

    public static void main(String[] args) {
        PrepareTest prepareTest = new PrepareTest();
        int[] answer = {1, 2, 3, 4, 5};
        int count[] = prepareTest.solution(answer);
        System.out.println(count[0]);
    }
}
