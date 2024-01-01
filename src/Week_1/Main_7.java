package Week_1;

public class Main_7 {
    public static void main(String[] args) {
        // 변수 타입별 크기 순서
        // byte(1) -> short(2) -> int(4) -> long(8) -> float(4) -> double(8)

        //(1) byte -> int
        byte byteNumber = 10;
        int intNumber = byteNumber;
        System.out.println(intNumber);

        //(2) char(1 byte) -> int(4) 형변환
        char charAlphabet = 'A';
        intNumber = charAlphabet; // char -> int로 자동 형변환
        System.out.println(intNumber);

        //(3) int -> long number 형변환
        intNumber = 100;
        long longNumber = intNumber;
        System.out.println(longNumber);

        //(4) int => double 형변환
        intNumber = 200;
        double doubleNumber = intNumber;
        System.out.println(doubleNumber);
    }
}
