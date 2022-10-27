package week6;

import java.util.HashSet;
import java.util.Set;

public class HashTable {

    private int size = 10000;
    private int[] talbe = new int[size];

    public HashTable() {
    }

    public HashTable(int size) { //size 주입받을 경우 talbe 범위는 size
        this.size = size;
    this.talbe = new int[size];
    }

    public int hash(String key) {
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum % size; //ex) 배열 사이즈가 1000이라면 asciiSum % 1000을 하면 0~999 사이의 값이 나와서 벗어나지 않음
    }
public void insert(String key,Integer value){
        int hashCode = hash(key); // 지정된 방 번호
        this.talbe[hash(key)] = value; // 지정된 방의 값
    System.out.println(hashCode + "방에 저장이 완료되었습니다.");

}
public int search (String key){

        return this.talbe[hash(key)];
}

    public static void main(String[] args) {
        String[] names = new String[]{"DongyeonKang",
                "SubinKang", "KwanwunKo", "HyunseokKo", "KyoungdukKoo", "YeonjiGu", "SoyeonKown", "OhsukKwon", "GunwooKim", "KiheonKim", "NayeongKim", "DohyeonKim", "MinkyoungKim", "MinjiKim", "SanghoKim", "SolbaeKim", "YejinKim", "EungjunKim", "JaegeunKim", "JeonghyeonKim", "JunhoKim", "JisuKim", "kimjinah", "HaneulKim", "HeejungKim", "KimoonPark", "EunbinPark", "JeongHoonPark", "JeminPark", "TaegeunPark", "JiwonBae", "SeunggeunBaek", "JihwanByeon", "HeungseopByeon", "JeongHeeSeo", "TaegeonSeo", "SeeYunSeok", "SuyeonSeong", "SeyoelSon", "MinjiSong", "JinwooSong", "hyunboSim", "SominAhn", "JiyoungAhn", "ChangbumAn", "SoonminEom",
                "HyeongsangOh", "SuinWoo", "JuwanWoo", "InkyuYoon", "GahyunLee", "DaonLee", "DohyunLee", "SanghunLee", "SujinLee", "AjinLee", "YeonJae", "HyeonjuLee", "HakjunYim", "SeoyunJang", "SeohyeonJang", "JinseonJang", "SujinJeon", "SeunghwanJeon", "DaehwanJung", "JaeHyunJeung", "HeejunJeong", "GukhyeonCho", "MunjuJo", "YejiJo", "ChanminJu", "MinjunChoi", "SujeongChoi", "SeunghoChoi", "AyeongChoi", "GeonjooHan", "JinhyuckHeo", "MinwooHwang", "SieunHwang",
                "JunhaHwang"};
        HashTable ht = new HashTable(200);
        Set<Integer> nameSet = new HashSet<>();
        for (int i = 0; i < names.length; i++) {
         ht.insert(names[i], ht.hash(names[i])); // 방번호 = 방의값으로 저장한 상태
        }
        System.out.println(ht.search("SubinKang"));
    }
}

