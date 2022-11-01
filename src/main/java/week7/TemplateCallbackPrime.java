package week7;

public class TemplateCallbackPrime { // 콜백사용 : 함수를 매개변수로 받고 싶을때 (특정 부분만 변경되기 때문에)
    boolean someOperation1(int a, int b) {
        return a < b;
    }

    boolean someOperation2 (int a , int b){
        return a < b/2;
    }

    boolean someOperation3 (int a , int b){
        return a <= b;
    }

    boolean isPrime(int num) {
        for (int i = 2; someOperation2(i, num); i++) { // a < b 를 구현하기 위해서 a = i  b = num 넣고
                                                        // 콜백함수에서 논리연산자를 사용한 다음 집어넣음
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
TemplateCallbackPrime tcp = new TemplateCallbackPrime();
boolean r = tcp.isPrime(17);
        System.out.println(r);
    }
}