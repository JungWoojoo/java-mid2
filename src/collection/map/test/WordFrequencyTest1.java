package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {

    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        Map<String, Integer> map = new HashMap<>();

        // 코드 작성
        String[] strings = text.split(" ");

        for (String key : strings) {
            if(map.containsKey(key)){
                Integer value = map.get(key);
                map.put(key, value + 1);
            }else {
                map.put(key, 1);
            }
        }

        System.out.println(map);
    }
}
