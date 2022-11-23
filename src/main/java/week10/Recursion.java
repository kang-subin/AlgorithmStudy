package week10;

public class Recursion {

    public static String printStar(int n){
        if(n == 0) return ""; // 재귀를 멈추게 하려면 매개변수로 들어오는 값의 변화가 있어야함

        return "*" + printStar(n -1); // 매개변수를 메소드가 실행될때마다 줄인 후 리턴을 하여 재귀를 멈추게 한다

    }

    public static int numberPlus(int n){
        if(n==0) return 0;
        return n + numberPlus(n - 1);
    }


    public static int number(int n){
        if(n == 0) return 0;
        return  n % 10 + number(n / 10); // 처음 들어온 값 계산한 뒤 자릿수를 바꿔서 또 나머지 연산을 시킴

    }

    public static int factorial (int n){
        if (n == 1) return n;
        return n * factorial(n - 1);

    }

    public static void main(String[] args) {
        System.out.println(printStar(3));
        System.out.println(numberPlus(4));
        System.out.println(number(3));
        System.out.println(factorial(3));
    }
}
