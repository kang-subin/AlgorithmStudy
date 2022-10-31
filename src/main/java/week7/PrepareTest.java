package week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrepareTest {
    int[] solution(int[] answer) {
        int[] first = {1, 2, 3, 4, 5};
        int[] score = new int[5];
        for (int i = 0; i < answer.length; i++) {
            if (first[i] == answer[i]) {
                score[i] = answer[i];
            }
        }
        return score;
    }

    public static void main(String[] args) {
PrepareTest prepareTest = new PrepareTest();
    int [] answer = {1,2,3,4,5};
   int answerScore [] = prepareTest.solution(answer);

    }
}
