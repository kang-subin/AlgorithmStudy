package week9;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSort2 {

    public static void main(String[] args) {
        int [] arr = {20, 28, 5, 19, 40, 50, 5, 25};

        int pivot = arr.length / 2;
        int leftIdx = 0;
        int rihgtIdx = arr.length -1;

        while (arr[leftIdx] < arr[pivot]) leftIdx += 1;
        System.out.println(leftIdx);


        while (arr[rihgtIdx] > arr[pivot]) rihgtIdx -= 1;
        System.out.println(rihgtIdx);

        int temp = arr[leftIdx];
        arr[leftIdx] = arr[rihgtIdx];
        arr[rihgtIdx] = temp;
        leftIdx += 1;
        rihgtIdx += 1;
        System.out.println(Arrays.toString(arr));

    }

}




// pivot 기준으로 idx 0~ 읽다가 pivot 보다 작으면 냅두고 옆칸으로 옮기기
// pivot 보다 큰 경우 생기면 비교하는 idx랑 pivot 위치 바꾸고 각 각 idx값에 -1, +1 하기

