package week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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




    public static void main(String[] args) {
        int[] arr = {2, 36, 1, 3};
        int x = 1;
        Numberarr numberarr = new Numberarr();
        numberarr.solution(arr, x);

    }
}
