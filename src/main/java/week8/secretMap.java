package week8;

import java.util.Arrays;

public class secretMap {
    //비밀지도 로직
    // 배열 arr1, arr2 를 이진수로 변환한다
    // arr1, arr2의 중복을 허용하고 합친다..?

    //이진수 변환
    String getBinaryString(int decNum) {
        String answer = "";
        while (decNum > 0) {
            answer += decNum % 2;
            decNum /= 2;
        }
        return answer;
    }


String getBinaryString2 (int n){
        String answer ="";
    while (n > 0) {
        answer += n % 2;
        n = n/2;
    }
        return answer;

}

String solution (int n, int[] arr1, int[] arr2){
        String answer ="";
        String [] sArr1 = new String[n];
        String [] sArr2 = new String[n];
    for (int i = 0; i < n ; i++) {
        for (int j = 0; j < n; j++) {
            String binStr1 = getBinaryString(arr1[i]);
            String binStr2 = getBinaryString(arr2[i]);
        sArr1[i] = "0".repeat(n - binStr1.length()) + binStr1 ; // arr1[i]에 0 을 n-(이진수자릿수) 만큼 더한 후 배열에 넣기
        sArr2[i] = "0".repeat(n - binStr2.length()) + getBinaryString(arr2[i]);
        }
    }
        System.out.println(Arrays.toString(sArr1));
        System.out.println(Arrays.toString(sArr2));

        return answer;
    }

    String[] solution2(int n, int[] arr1, int[] arr2) {
        var answer = new String[n];
        for (int i = 0; i < n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]) // | 비트연산을 통해서 arr1[i], arr2[i] 를 계산한 이진수 값을 도출
                    .replace("1", "#").replace("0", " "); //#," " 형태로 변환
            answer[i] = " ".repeat(n - answer[i].length()) + answer[i]; // 자릿수 맞추기
        }

        System.out.println(Arrays.toString(answer));

        return answer;
    }




    public static void main(String[] args) {
        int [] arr1 = {9, 20, 28, 18, 11};
        int [] arr2 ={30, 1, 21, 17, 28};
        secretMap SecretMap = new secretMap();
        SecretMap.solution(5 ,arr1,arr2);
        SecretMap.solution2(5,arr1, arr2);


    }



}