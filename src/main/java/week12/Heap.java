package week12;
import java.util.Arrays;

public class Heap {

    public static int [] solution (int [] arr , int parentIdx) {
        int leftIdx = (parentIdx * 2) + 1;
        int rightIdx = (parentIdx * 2) + 1;
        int greaterIdx = parentIdx;

        //왼쪽이 parent 보다 크다면 greaterIdx(부모) = leftIdx(자식)  6 7 5 -> 7 6 5
        if (leftIdx < arr.length && arr[leftIdx] > arr[greaterIdx]) {
                greaterIdx = leftIdx;
        }

        //오른쪽이 greaterIdx(부모) 보다 크다면
        if(rightIdx < arr.length && arr[rightIdx] > arr[greaterIdx]){
            greaterIdx = rightIdx;
        }

        int temp = arr[parentIdx];
        arr[parentIdx] = arr[greaterIdx];
        arr[greaterIdx] = temp;
        return arr;
    }

     public static  void index(int [] arr) {

         int parentIdx = 1; // n
         int leftIdx;  // 2n+1
         int rightIdx; // 2n+2

         //자식 idx 구하는 함수
         leftIdx = (parentIdx * 2) + 1;
         rightIdx = (parentIdx * 2) + 1;

             }


    public static void main(String[] args) {
        int [] arr = {6,5,7,8};
        int [] heapdArr = solution(arr,1); // parentIdx 는 자식을 가지고 있는 가장 마지막 부모의 idx를 넣어주면 됨
        System.out.println(Arrays.toString(heapdArr));

        heapdArr = solution(arr,0);
        System.out.println(Arrays.toString(heapdArr));


    }
}
