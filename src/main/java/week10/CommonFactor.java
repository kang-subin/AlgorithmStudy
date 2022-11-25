package week10;

public class CommonFactor {

public static int nums (int a, int b){
    if(a == b) return a;
    if(a < b) return nums(a,(b-a));
    if(a > b) return nums((a-b),b);
    return 1;
}

public static int nums2 (int a, int b){
// while 을 따로 분리해서 진행하여 에러발생,
// while 문 안에 if-eles if 사용해서 한꺼번에 계산
// 재귀를 빼려면 while,변수 필요


    while (a != b)  {
        if(a > b) {
            a = a - b;
        } else if (a < b) {
            b = b-a;
        }
    }

    if(a == b) return a;

    return 1;
}


    public static void main(String[] args) {
        System.out.println(nums(196,42));
        System.out.println(nums2(196, 42));
    }
}
