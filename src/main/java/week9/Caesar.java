package week9;

import java.util.Arrays;

public class Caesar {

public String solution (String a , int n) {

    String [] arr = new String[a.length()];
    String ceasarcode ="";
    char ceasar = 0;
    for (int i = 0; i < a.length(); i++) {
        char aphabet = a.charAt(i);
        int asci = aphabet + n;
        ceasar = (char) asci;
        arr[i] = ceasar + "";
        ceasarcode += arr[i];

    }
    return ceasarcode;
}
    //문자열을 문자로 쪼개고
    //문자를 숫자로 변환한 다음 n 만큼 더하고
    //다시 숫자를 문자로 바꿔서 출력
//        int asci = a.charAt(0);
//        int aphabet = (int)asci + n;
//        char apha = (char) aphabet;
//        return apha;


    public static void main(String[] args) {
        int n = 1;
        String a = "AB";
        Caesar caesar = new Caesar();
        System.out.println((caesar.solution(a,n)));

    }
}
