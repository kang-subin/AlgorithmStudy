package week8.sort;

import java.util.Arrays;

public class SelectionSort {
    public int[] SelectionSortAsc(int[] arr , StatementStrategy statementStrategy) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[minIdx] > arr[j]) minIdx = j;
            } // 크기 비교

            //위치 변경
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
            System.out.println(Arrays.toString(arr));

        }
                return arr;
    }

    public int[] selectionSrotDesc (int[] arr, StatementStrategy statementStrategy) {

        for (int i = 0; i < arr.length - 1; i++) {
            int maxIdx = arr.length - 1;
            for (int j = i; j < arr.length; j++) {
                if (arr[maxIdx] < arr[j]) maxIdx = j;
            } // 크기 비교

            //위치 변경
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
            System.out.println(Arrays.toString(arr));
        }
          return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        SelectionSort ss = new SelectionSort();
        ss.SelectionSortAsc(arr, (a, b) -> a > b);
        ss.selectionSrotDesc(arr, (a, b) -> a < b);



    }
}










