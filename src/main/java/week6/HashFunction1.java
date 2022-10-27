package week6;

public class HashFunction1 { // hash 함수
    public int hash(String key) {
            int asciiSum = 0;
            for (int i = 0; i < key.length(); i++) {
                char c = key.charAt(i);
                int ascii = key.charAt(i);

            }
            return asciiSum % 90;
        }

    public static void main(String[] args) {
 HashFunction1 hf = new HashFunction1();
    hf.hash("subin");
    }


}
