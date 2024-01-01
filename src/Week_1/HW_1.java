package Week_1;

import java.util.Scanner;

public class HW_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String title = sc.nextLine();
        float inputScore = sc.nextFloat();
        String comment1 = sc.nextLine();
        String comment2 = sc.nextLine();
        String comment3 = sc.nextLine();
        String comment4 = sc.nextLine();
        String comment5 = sc.nextLine();
        String comment6 = sc.nextLine();
        String comment7 = sc.nextLine();
        String comment8 = sc.nextLine();
        String comment9 = sc.nextLine();
        String comment10 = sc.nextLine();

        int outputScore = (int)inputScore;
        double pro = (outputScore / 5.0)*100;

        System.out.println("[ " + title + " ]");
        System.out.print("별점: " + outputScore);
        System.out.println(" (" + pro + "%)");
        System.out.println("1. " + comment1);
        System.out.println("2. " + comment2);
        System.out.println("3. " + comment3);
        System.out.println("4. " + comment4);
        System.out.println("5. " + comment5);
        System.out.println("6. " + comment6);
        System.out.println("7. " + comment7);
        System.out.println("8. " + comment8);
        System.out.println("9. " + comment9);
        System.out.println("10. " + comment10);
    }
}
