package week10;

public class PrintStar {

public static String star (int n){
    if(n == 0) return "";
    String star = "*";
    return star + star(n-1) ;
}

public static void printStar(int n){
    if(n==0) return;
    printStar(n-1);
    System.out.println(star(n));
}



    public static void main(String[] args) {
        System.out.println(star(5));
        printStar(5);
}
}
