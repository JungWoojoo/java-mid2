package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {

    public static void main(String[] args) {
        Map<String, Object> dictionary = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("==단어 입력 단계==");
        while(true) {
            System.out.print("영어 단어를 입력하세요. (종료는 'q'): ");
            String inputEn = sc.nextLine();
            if(inputEn.equals("q")){
                break;
            }
            System.out.print("한글 뜻을 입력하세요: ");
            String inputKr = sc.nextLine();
            dictionary.put(inputEn, inputKr);
        }

        System.out.println("\n==단어 검색 단계==");
        while(true) {
            System.out.print("찾을 영어 단어를 입력하세요. (종료는 'q'): ");
            String inputEn = sc.nextLine();
            if(inputEn.equals("q")){
                break;
            }
            if(dictionary.containsKey(inputEn)){
                System.out.println(inputEn + "의 뜻: " + dictionary.get(inputEn));
            }else {
                System.out.println(inputEn + "은(는) 사전에 없는 단어입니다.");
            }
        }
    }

}
