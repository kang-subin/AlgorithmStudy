package week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sameNumberHate {
    public int [] solution (int [] arr) { // 나랑 반대
        List<Integer> answerList = new ArrayList<>();
        answerList.add(arr[0]); // arr 랑 비교하기 위해서
        for (int i = 1; i < arr.length ; i++) {
            if (answerList.get(answerList.size() - 1) != arr[i]) answerList.add(arr[i]);
        }

        int [] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int [] arr = {1,1,3,3,0,1,1};
        sameNumberHate sameNumberHate = new sameNumberHate();
        sameNumberHate.solution(arr);

    }
}
