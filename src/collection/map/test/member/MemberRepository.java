package collection.map.test.member;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MemberRepository {

    private Map<String, String> map = new HashMap<>();

    public void save(Member member){
        map.put(member.getId(), member.getName());
    }

    public void remove(String id){
        map.remove(id);
    }

    public Member findById(String id){
        String name = map.get(id);
        if(name == null){
            return null;
        }
        return new Member(id, name);
    }

    public Member findByName(String name){
        Set<Map.Entry<String, String>> members = map.entrySet();
        String id = "";
        for (Map.Entry<String, String> member : members) {
            if(member.getValue().equals(name)){
                id = member.getKey();
            }
        }
        return new Member(id, name);
    }
}
