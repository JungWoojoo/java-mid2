package collection.link;

import java.util.LinkedList;

public class MyLinkedListV2Main {
    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();
        //마지막에 추가 //0(n)
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        //첫번째 항목에 추가, 삭제
        System.out.println("첫 번째 항목에 추가");
        list.add(0, "d"); //0(1)
        System.out.println(list);

        System.out.println("첫 번째 항목에 삭제");
        list.remove(0);
        System.out.println(list);
        //중간 항목에 추가, 삭제
        System.out.println("1인덱스 항목에 추가");
        list.add(1, "e"); //0(n)
        System.out.println(list);

        System.out.println("1인덱스 항목에 추가");
        list.remove(1); //0(n)
        System.out.println(list);
    }
}
