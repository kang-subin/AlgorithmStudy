package week8;

import java.util.Scanner;

public class BinarySerch {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int n = nums.length / 2;
        int a = nums[n]; //중간값 찾기
        Scanner in = new Scanner(System.in);
        int b = in.nextInt(); // 찾는값

        for (int i = n; i < nums.length; i++) { // 중간 인덱스부터 끝까지..?
            if (a < b) {
        int nums2 [] = new int[n];
                for (int j = 0; j < n; j++) {
                    nums2[j] = nums[i];
                }
            }
        }
    }
}
