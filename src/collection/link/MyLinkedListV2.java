package collection.link;

public class MyLinkedListV2 {
    private Node first;
    private int size = 0;

    public void add(Object e){
        Node newNode = new Node(e);
        if(first == null){
            first = newNode;
        } else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node getLastNode() {
        Node x = first;
        while (x.next != null){
            x = x.next;
        }
        return x;
    }

    //추가 코드
    public void add(int index, Object e){
        Node newNode = new Node(e);
        if(index == 0){
            newNode.next = first;
            first = newNode;
        } else {
            //직전 노드 찾아서 뉴노드를 참조
            Node prev = getNode(index -1);
            newNode.next = prev.next; // 추가될 위치의 전에 인덱스에서 가지고 있는 next 참조값을 새로운 node의 next에 담음 (이시점의 prev.next는 추가될 인덱스 기존의 노드 참조값을 가지고 있음)
            prev.next = newNode; // prev.next 추가될 위치의 next 참조값을 새로 생성한 노드의 참조값으로 변경
        }
        size++;
    }

    public Object set(int index, Object e){
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = e;
        return oldValue;
    }

    //추가 코드
    public Object remove(int index){
        Node removeNode = getNode(index);
        Object removedItem = removeNode.item;
        if(index == 0){
            first = removeNode.next;
        } else {
            Node prev = getNode(index - 1);
            prev.next = removeNode.next; //내가 가지고 있던 다음 연결 참조값을 이전 인덱스에 연결
        }

        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removeNode;
    }

    public Object get(int index){
        Node node = getNode(index);
        return node.item;
    }

    private Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public int indexOf(Object o){
        int index = 0;
        for(Node x = first; x != null; x = x.next){
            if(o.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
