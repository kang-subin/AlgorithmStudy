package week8;

public class Harshad {
    boolean solution(int x) {
        int sum = 0;
        while (x > 0) { //몫이 0  이 될 때 까지
            sum += x % 10;  //나머지 sum에 누적
            x = x / 10;
        }
        System.out.println(sum);
        // 기본값
        boolean answer = false;
        if (x % sum == 0) {
            answer = true;

        }
        return answer;
    }

    public static void main(String[] args) {
        int x = 123;
    Harshad harshad = new Harshad();
    harshad.solution(x);
    }
}
