package week7.prime;

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

    boolean isPrime(int num , StatementStratgy stmt) {
        for (int i = 2; stmt.compare(i, num); i++) {
            System.out.println(i);
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
TemplateCallbackPrime tcp = new TemplateCallbackPrime();
boolean r = tcp.isPrime(17, new StatementStratgy() {
    @Override
    public boolean compare(int a, int b) {
        return a * a < b;
    }
});
        System.out.println(r);
    }
}