package week5;

public class HashFunction { // hash 함수
    public int hash(String key) {
            int asciiSum = 0;
            for (int i = 0; i < key.length(); i++) {
                char c = key.charAt(i);
                int ascii = key.charAt(i);

            }
            return asciiSum % 90;
        }

    public static void main(String[] args) {
 HashFunction hf = new HashFunction();
    hf.hash("subin");
    }


}
