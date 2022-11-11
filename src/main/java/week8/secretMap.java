package week8;

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








}