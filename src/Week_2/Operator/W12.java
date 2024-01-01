package Week_2.Operator;

public class W12 {
    public static void main(String[] args) {
        // 중첩 if문
        boolean flag = true;
        int number = 2;

        if (flag) {
            if (number == 1) {
                System.out.println("flag가 true이고, number 값은 1입니다");
            } else if (number == 2) {
                System.out.println("flag가 true이고, number 값은 2입니다");
            } else {
                System.out.println("flag가 true이고, number 값은 모릅니다");
            }
        } else {
            if (number == 1) {
                System.out.println("flag가 false이고, number 값은 1입니다");
            } else if (number == 2) {
                System.out.println("flag가 false이고, number 값은 2입니다");
            } else {
                System.out.println("flag가 false이고, number 값은 모릅니다");
            }
        }
    }
}
