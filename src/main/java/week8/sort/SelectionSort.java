package week8.sort;

import java.util.Arrays;
import java.util.function.BiFunction;

public class SelectionSort {
    public int[] SelectionSort(int[] arr , BiFunction<Integer, Integer, Boolean> stmt) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i; j < arr.length; j++) {
                if (stmt.apply(arr[minIdx], arr[j])) minIdx = j; // stmt 의 매개변수
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
        BiFunction<Integer, Integer, Boolean> biFunction = (a, b) -> a > b;
    }
}









