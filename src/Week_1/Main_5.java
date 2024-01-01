package Week_1;

public class Main_5 {

    public static void main(String[] args) {
        //형 변환 예제: 변수의 타입을 바꾸는 방법
        // 문자열 -> 숫자
        // 정수 -> 실수
        // 실수 -> 정수

        // double형 or floatgud -> int
        // 실수 -> 정수(0.xxxx -> 0)
        double doubleNumber = 10.1010;
        float floatNumber = 10.101010f;

        // 변환(int)
        int intNumber;
        intNumber = (int)floatNumber;
        System.out.println("float Type ==> " + floatNumber);
        System.out.println("Int Type ==>" + intNumber);

//        intNumber = (int)doubleNumber; // double -> int
//        System.out.println("Double Type ==> " + doubleNumber);
//        System.out.println("Int Type ==>" + intNumber);
    }
}
