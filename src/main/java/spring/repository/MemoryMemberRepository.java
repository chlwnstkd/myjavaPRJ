package spring.repository;

import spring.domain.Member;

import java.util.*;

public class MemoryMemberRepository {
    private static Map<Long,Member> store = new HashMap<>();
    private static long sequence = 0L;

    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(),member);
        return member;
    }


    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }


    public Optional<Member> findByName(String name) {
        return store.values().stream()
                .filter(member -> member.getName().equals(name))
                .findAny();
    }


    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearStore(){
        store.clear();
    }
}
