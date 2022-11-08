package week8;

import java.util.Scanner;

public class BinarySerch {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int midIdx= nums.length / 2;
        int startIdx = 0;
        int endIndx = nums.length -1 ;
        int midValue = nums[midIdx]; //중간값 찾기
        int targetNum = 7;

            if (midValue > targetNum) {
                startIdx = midIdx + 1;
            } else  if ( midValue < targetNum ) {
                endIndx = midIdx - 1;
            }else{
                System.out.println(midIdx);
            }
        }
    }


