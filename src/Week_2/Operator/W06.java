package Week_2.Operator;

public class W06 {
    public static void main(String[] args) {
        // 대입 연산자에서 주의해야 할 점!!
        // ++, --
        int a = 10;
        int b = 10;
        int val = ++a + --b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(val);
    }
}
