package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cart {
    private Map<Product, Integer> map = new HashMap<>();

    public void add(Product product, int count){
        if(map.containsKey(product)){
            map.put(product, map.get(product) + count);
        } else {
            map.put(product, count);
        }
    }

    public void minus(Product product, int count){
        if(map.containsKey(product)){
            map.put(product, map.get(product) - count);
        }
        if(map.get(product) < 1){
            map.remove(product);
        }
    }

    public void printAll(){
        System.out.println("==모든 상품 출력==");
        Set<Map.Entry<Product, Integer>> entries = map.entrySet();
        for (Map.Entry<Product, Integer> entry : entries) {
            System.out.println("상품: " + entry.getKey() + " 수량: " + entry.getValue());
        }
    }


}
