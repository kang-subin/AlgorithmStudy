package week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

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

    public int [] solution2(int [] arr){
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            if(st.peek() != arr[i]) st.push(arr[i]);
        }
        //거꾸로 꺼내기
        var answer = new int [st.size()];
        for (int i = st.size(); i >=0;  i--) {
            answer[i] = st.pop();
        }

        return answer;
    }

    public static void main(String[] args) {
        int [] arr = {1,1,3,3,0,1,1};
        sameNumberHate sameNumberHate = new sameNumberHate();
        sameNumberHate.solution(arr);

    }








}
