package collection.deque.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    private Deque<String> stack = new ArrayDeque<>();
    private String currentPage = null;

    public void visitPage(String url){
        if(currentPage != null){
            stack.push(currentPage);
        }
        currentPage = url;
        System.out.println("방문: " + url);
    }

    public String goBack(){
        if(!stack.isEmpty()){
            currentPage = stack.pop();
            System.out.println("뒤로 가기: " + currentPage);
            return currentPage;
        }
        return null;
    }
}
