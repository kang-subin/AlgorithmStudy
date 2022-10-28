package week6;
import java.util.HashSet;

//포켓몬 종류 배열 있다고 가정
// 포켓몬 종류 배열의 길이 나누기 2 한 갯수를 가져갈 수 있음
// 포켓몬 종류의 중복 제거한 최대의 수 구하면 됨?

import java.util.HashSet;
import java.util.Set;

public class Pokemon {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length ; i++) {
            set.add(nums[i]); // 배열 주입을 이렇게 하는 듯?
        }
        int N = nums.length / 2;
        if (set.size() < N) {
            return set.size();
        }else{
            return N;
        }
    }

}

