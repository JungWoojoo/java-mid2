package collection.map.test;

import java.util.*;

public class ArrayToMapTest {

    public static void main(String[] args) {

        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

        Map<String, Integer> map = new HashMap<>();

        // 주어진 배열로부터 Map 생성
        for (String[] strings : productArr) {
            List<String> list = Arrays.asList(strings);
            map.put(list.get(0), Integer.valueOf(list.get(1)));
        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("제품: " + entry.getKey() + ", 가격: " + entry.getValue());
        }
    }
}
