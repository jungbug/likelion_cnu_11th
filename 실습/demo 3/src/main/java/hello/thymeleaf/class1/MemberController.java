package hello.thymeleaf.class1;
import hello.thymeleaf.class1.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    @Autowired
    private final MemberService memberService;

    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }
}
