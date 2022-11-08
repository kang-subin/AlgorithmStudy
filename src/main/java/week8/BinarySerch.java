package week8;

import java.util.Scanner;

public class BinarySerch {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        int startIdx = 0;
        int endIndx = nums.length - 1;

        int targetNum = 7;

        while (startIdx <= endIndx) {

            int midIdx = (startIdx + endIndx) / 2;  //midIdx 값이 변하기 때문에
            int midValue = nums[midIdx]; //중간값 찾기
            if (midIdx == targetNum) {
                System.out.printf("%d는 %d에 있습니다.", targetNum, midIdx);

            } else if(midValue > targetNum) { // 중간 이하 제거함
                startIdx = midIdx + 1;
            } else if (midValue < targetNum) {
                endIndx = midIdx - 1; // 중간 이상 제거
            } else {
                System.out.println(midIdx);
            }
        }
    }
}


