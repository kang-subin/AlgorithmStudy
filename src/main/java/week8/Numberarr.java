package week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Numberarr {
    int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
                if (arr[i] % divisor == 0)
                    list.add(arr[i]);
        }
        if (list.size() == 0) return new int[]{-1};
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.get(i); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort((answer));
        return answer;
    }

    public int[] solution2(int[] arr, int divisor) {

        PriorityQueue<Integer> list = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) list.add(arr[i]);
        }

        if(list.size() == 0) return new int[]{-1};

        // list를 Array로 바꾸고
        int[] answer = new int[list.size()];
        int idx = 0;
        while(!list.isEmpty()){
            answer[idx++] = list.poll();
        }
        return answer;
    }




    public static void main(String[] args) {
        int[] arr = {2, 36, 1, 3};
        int x = 1;
        Numberarr numberarr = new Numberarr();
        numberarr.solution(arr, x);

    }
}
