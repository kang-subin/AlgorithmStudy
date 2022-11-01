package week7;

public class Prime {
    public boolean primetest (int num) {
        for (int i = 2; i < num; i++) { // 1은 소수가 아니기 때문에 소수가 아님 , 자기 자신 또한 마찬가지
            int a = (num % i);
            if (a != 0) {
             return false;
        } }
            return true; //루프가 다 false 일 때 prime 이 true 여야 하기 때문에 기본설정이 true
    }

    public static void main(String[] args) {
        int num = 14;
      new Prime().primetest(num);
    }
}
