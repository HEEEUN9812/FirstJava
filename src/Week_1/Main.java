package Week_1;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

// 클래스
// public: 제어자, public(공공의, 공통의)
public class Main {
    // JDK
    // (1) compiler : .java -> .class
    // (2) JRE
    // (3) JDB : 디버깅

    // () : 소괄호
    // {} : 중괄호
    // [] : 대괄호

    // main 메소드
    // 자바 프로젝트(앱)는, 제일 먼저 클래스의 main 메소드를 실행시킨다.
    // = JVM의 약속
    // static: 이 프로그램이 시작될 때 무조건 실행되는 녀석임을 표현

    //output
    // void: 메소드의 출력값이 데이터 타입
    // void: "아무것도 없다." -> 출력은 없다

    //input
    // String[] args: 매개변수 자리
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        //객체: 특징(속성, 변수), 행동(메소드)
        // print -> 줄 바꿈은 하지 x
        // print -> 줄 바꿈 o
        // ln: line
        System.out.println("Our First Project!");

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
            System.out.println("i = " + i);
        }

        System.out.println(7);
        System.out.println(3);
        System.out.println(3.14);
        System.out.println("JAVA");
    }
}
