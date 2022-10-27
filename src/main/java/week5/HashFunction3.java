package week5;

import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.hash;

public class HashFunction3 {

    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> memo = new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            String key = participant[i];
            if(!memo.containsKey(key)){
                memo.put(key,0);
            }
            memo.put(key, memo.get(key) + 1);
        }
        for (int i = 0; i < completion.length; i++) {
            String key = completion[i];
            memo.put(key, memo.get(key) - 1);//완주자들 0으로 변경
        }
        for (String key : memo.keySet()) {
            if (memo.get(key) == 1) {   // 완주하지 못한 사람의 키 값
                return key;
            }
        }
        return "";
    }



    public static void main(String[] args) {
HashFunction3 hashFunction3 = new HashFunction3();

String [] participant = {"leo", "kiki", "eden"};
String [] completion = {"eden", "kiki"};
hashFunction3.solution(participant,completion);
        String Answer = hashFunction3.solution(participant, completion);
        System.out.println(Answer);

    }

}




