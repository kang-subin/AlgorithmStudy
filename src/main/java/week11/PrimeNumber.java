package week11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {

    public static void solution () {
        Scanner in = new Scanner(System.in);
        Long num = in.nextLong();
        List<Integer> arr = new ArrayList<>();
        int idx = 2; // 소수는 2부터 시작
       while (idx <= num){ // 계속 나눠서 idx == num 이랑 같아지게 만들어야 해서 = 붙임
                if (num % idx == 0) { // 나머지 0 == 소수
                    arr.add(idx); // 리스트에 저장
                    //System.out.println(idx);
                    num /= idx; } // 저장 후 idx로 나눠서 계속 소수 구하기
                 else idx++; // 나머지가 0 안되는 수 는 넘어가기
        }
        System.out.println(arr.get(arr.size()-1)); // 소수 리스트의 최대값
    }

    public static void main(String[] args) {

    }
}

