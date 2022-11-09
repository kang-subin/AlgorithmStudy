package week8.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        int i = 0;
        int minIdx = 0; //
        for (int j = 0; j < arr.length; j++) {
            if (arr[minIdx] > arr[j]) minIdx = j;
        }

        int temp = arr[0];
        arr[0] = arr[minIdx];
        arr[minIdx] = temp;
        System.out.println(Arrays.toString(arr));

        i = 1;
        minIdx = 1;
        for (int j = 1; j < arr.length; j++) {
            if (arr[minIdx] > arr[j]) minIdx = j;
        }
        temp = arr[1];
        arr[1] = arr[minIdx];
        arr[minIdx] = temp;
        System.out.println(Arrays.toString(arr));

        i = 2;
        minIdx = 2;
        for (int j = 2; j < arr.length; j++) {
            if (arr[minIdx] > arr[j]) minIdx = j;
        }
        temp = arr[2];
        arr[2] = arr[minIdx];
        arr[minIdx] = temp;
        System.out.println(Arrays.toString(arr));

        i = 3;
        minIdx = 3;
        for (int j = 3; j < arr.length; j++) {
            if (arr[minIdx] > arr[j]) minIdx = j;
        }
        temp = arr[3];
        arr[3] = arr[minIdx];
        arr[minIdx] = temp;
        System.out.println(Arrays.toString(arr));

        i = 4;
        minIdx = 4;
        for (int j = 4; j < arr.length; j++) {
            if (arr[minIdx] > arr[j]) minIdx = j;
        }
        temp = arr[4];
        arr[4] = arr[minIdx];
        arr[minIdx] = temp;
        System.out.println(Arrays.toString(arr));





    }




    }








