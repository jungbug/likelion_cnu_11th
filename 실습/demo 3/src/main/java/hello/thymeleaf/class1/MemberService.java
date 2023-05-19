package hello.thymeleaf.class1;

import hello.thymeleaf.class1.Member;
import hello.thymeleaf.class1.MemberRepository;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    private final MemberRepository memberRepository = new MemberRepository();

    public Long join(Member member){
        Optional<Member> result = memberRepository.findByName(member.name());
        result.ifPresent(m -> {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        });
        memberRepository.save(member);
        return member.id();
    }

    public List<Member> findMembers(){
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId){
        return memberRepository.findById(memberId);
    }

}
