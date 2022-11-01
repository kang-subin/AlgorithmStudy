package week7.prime;

public class TemplateCallbackPrime { // 콜백사용 : 함수를 매개변수로 받고 싶을때 (특정 부분만 변경되기 때문에)

    boolean someOperation1(int a, int b) {
        return a < b;
    }

    boolean someOperation2(int a, int b) {
        return a < b / 2;
    }

    boolean someOperation3(int a, int b) {
        return a <= b;
    }

    boolean isPrime(int num, StatementStratgy stmt) {
        for (int i = 2; stmt.compare(i, num); i++) {
            System.out.println(i);
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        TemplateCallbackPrime tcp = new TemplateCallbackPrime();
        System.out.println(tcp.isPrime(13, (a, b)-> a < b)); // 익명 내부 클래스의 경우 코드가 더 복잡해 짐 따라서 람다식으로 표현함
        System.out.println(tcp.isPrime(17, (a, b)-> a < b/2));
        System.out.println(tcp.isPrime(19, (a, b)-> a * a < b));

    }
}