package week10;

public class Print {

public static String star (int n){ //별 출력하기
    if(n == 0) return "";
    String star = "*";
    return star + star(n-1) ;
}

public static void printStar(int n){ // stack 메모리는 후입선출 구조라서 내가 처음 출력한 것이 맨 마지막에 호출된다
    if(n==0) return;
    printStar(n-1);
    System.out.println(star(n));
}

public static String num (int n){ // 숫자 출력하기
    if(n==1) return "1";
    return num(n-1) + " " + n; // num(4)로 바뀐 후 바로 리턴이 아니라  " 1 2 3 4 5" 역순으로 쌓아서 출력

}

public static void printNum(int n){
    if(n==0) return;
    printNum(n-1);
    System.out.println(num(n));
}



    public static void main(String[] args) {
        System.out.println(star(5));
        printStar(5);
        System.out.println(num(4));
        printNum(5);
}
}
