package Week_2.Array;

public class Arr03 {
    public static void main(String[] args) {
        // 얕은 복사

        int[] a = {1, 2, 3, 4};
        int[] b = a;  // 얕은 복사
        int[] c = a.clone(); // 깊은복사 -> 단, 2차원 이상 배열에서는 얕은 복사


        b[0] = 3; // b 배열의 0번째 순번값을 3으로 수정했습니다 (1 -> 3)

        System.out.println(a[0]); // 출력3 <- a 배열의 0번째 순번값도 3으로 조회됩니다

    }
}