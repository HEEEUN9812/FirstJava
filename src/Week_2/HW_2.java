package Week_2;

import java.util.*;

public class HW_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String collectionType = sc.nextLine();
        String title = sc.nextLine();

        switch (collectionType) {
            case "List":
                ArrayList<String> strList = new ArrayList<>();
                while (true) {
                    String content = sc.nextLine();
                    if (Objects.equals(content, "끝")) {
                        break;
                    } else {
                        strList.add(content);
                    }
                }
                System.out.println("[ " + collectionType + " 로 저장된 " + title + "]");
                for (int i = 0; i < strList.size(); i++) {
                    System.out.println((i + 1) + ". " + strList.get(i));
                }
                break;

            case "Set":
                Set<String> strSet = new HashSet<>();
                while (true) {
                    String content = sc.nextLine();
                    if (Objects.equals(content, "끝")) {
                        break;
                    } else {
                        strSet.add(content);
                    }
                }
                System.out.println("[ " + collectionType + " 으로 저장된 " + title + " ]");
                Iterator<String> itrSet = strSet.iterator();
                for (int i = strSet.size(); i < strSet.size(); i++) {
                    System.out.println((i + 1) + ". " + itrSet.next());
                }
                break;

            case "Map":
                Map<Integer, String> strMap = new HashMap<>();
                int number = 1;
                while (true) {
                    String content = sc.nextLine();
                    if (Objects.equals(content, "끝")) {
                        break;
                    } else {
                        strMap.put(number++, content);
                    }
                }
                System.out.println("[ " + collectionType + " 으로 저장된 " + title + " ]");
                for (int i = 0; i < strMap.size(); i++) {
                    System.out.println((i+1) +". " + strMap.get(i + 1));
                }
                break;

            default:
                System.out.println("잘못 입력했습니다.");
        }
    }
}