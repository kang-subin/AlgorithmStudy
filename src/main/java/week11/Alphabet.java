package week11;

public class Alphabet {
    private static final String alphabet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void printAlphabet (){
        //  String 에 A~Z 까지를 담아서 문자열을 문자로 하나씩 뽑아서 A~Z를 출력함
        for (int i = 0; i < 26; i++) {
            System.out.println(alphabet.charAt(i));

        }
    }

    public static void printAlphabet2 () {
        //
            for (char d = 'A'; d <= 'Z'; d++) { // 'A' ~ 'Z' 까지
                for (char c = 'A'; c <= 'Z'; c++) {
                    System.out.printf("%s%s\n", d,c);
                }
            }
        }

     // 칸이 N 개인 경우 (재귀사용)
    public static char printAlphabet3(char a){

        if(a > 'Z') return ' '; // 탈출조건
        System.out.println(a); // 알파벳 출력
        return printAlphabet3((char)(a+1));
        // int 를 char 으로 형변환하여 +1 연산 한 후 재귀
    }

        public static void printAlphabet4(char c, String prefix) {
            if (c > 'Z') return; // 탈출조건
            System.out.println(prefix + c);
            printAlphabet4((char)(c + 1), prefix); // char c 가 변화 됨
        }

    public static void main(String[] args) {
    printAlphabet();
    printAlphabet2();
    printAlphabet3('A');
    printAlphabet4('A',"A");

    }
}
