package hello.thymeleaf.class1;
import java.util.*;
public class MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();

    private static long sequence = 0L;

    public Member save(Member member){
        member.setId(++sequence);
        store.put(member.id(), member);
        return member;
    }

    public Optional<Member> findById(Long id){
        return Optional.ofNullable(store.get(id));
    }


    public Optional<Member> findByName(String name){
        return store.values().stream()
                .filter(member -> member.name().equals(name))
                .findAny();
    }

    public List<Member> findAll(){
        return new ArrayList<>(store.values());
    }

}
