package Week_2.Array;

import java.util.Arrays;

public class Arr02 {
    public static void main(String[] args) {
        // 초기화

        //1. 배열에 특정값 대입해서 선언
        int[] intarr = {1, 2, 3, 4, 5};
        String [] strintArray = {"a", "b", "c", "d"};

        // 2. for문을 통해서 대입
        for (int i = 0; i <intarr.length; i++){
            intarr[i] = i;
        }

        System.out.println("------------");

        // 다건 출력
        for (int i = 0; i < intarr.length; i++){
            System.out.println(intarr[i]);
        }

        int[] intArray = {10, 20, 30, 40, 50};
        for(int item: intArray){
            System.out.println(item);
        }

        //배열의 주소를 모두 같은 값으로 초기화
        Arrays.fill(intArray, 1);
        for(int item: intArray){
            System.out.println(item);
        }
    }
}
