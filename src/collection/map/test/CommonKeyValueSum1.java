package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CommonKeyValueSum1 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        //코드 작성
        Map<String, Integer> map3 = new HashMap<>();

        Set<String> keySet1 = map1.keySet();
        Set<String> keySet2 = map2.keySet();
        for (String string : keySet1) {
            if (keySet2.contains(string)) {
                Integer integer1 = map1.get(string);
                Integer integer2 = map2.get(string);
                map3.put(string, (integer1 + integer2));
            }
        }

        System.out.println(map3);
    }

}
