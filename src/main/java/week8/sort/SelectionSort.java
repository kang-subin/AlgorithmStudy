package week8.sort;

import java.util.Arrays;

public class SelectionSort {
    public int[] SelectionSort(int[] arr , StatementStrategy statementStrategy) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i; j < arr.length; j++) {
             //   if (arr[minIdx] > arr[j]) minIdx = j; callback으로 변경
                if (statementStrategy.apply(arr[minIdx], arr[j])) minIdx = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
            System.out.println(Arrays.toString(arr));

        }
                return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        SelectionSort ss = new SelectionSort();
        ss.SelectionSort(arr, (a, b) -> a < b);
        ss.SelectionSort(arr, (a, b) -> a > b);
    }
}









