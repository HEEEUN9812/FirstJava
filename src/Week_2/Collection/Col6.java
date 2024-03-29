package Week_2.Collection;

import java.util.HashMap;
import java.util.Map;

public class Col6 {
    public static void main(String[] args) {
        // Map: Key - value pair -> 중요!
        // key 라는 값으로 unique하게 보장이 돼야 함
        // Map -> HashMap, TreeMap으로 응용

        Map<String, Integer> intMap = new HashMap<>();

        // 키 값
        intMap.put("일", 11);
        intMap.put("이", 12);
        intMap.put("삼", 13);
        intMap.put("삼", 14); // 중복
        intMap.put("삼", 15); // 중복
        intMap.put("삼", 16); // 중복

        // key 값 전체 출력(향상된 for)
        for(String key: intMap.keySet()){
            System.out.println(key);
        }

        // value 값 전체 출력(향상된 for)
        for(Integer value: intMap.values()){
            System.out.println(value);
        }

        System.out.println(intMap.get("삼"));
    }
}
