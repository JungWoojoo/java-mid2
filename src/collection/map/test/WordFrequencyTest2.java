package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest2 {

    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        Map<String, Integer> map = new HashMap<>();

        // 코드 작성
        String[] strings = text.split(" ");

        for (String key : strings) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        System.out.println(map);
    }
}
