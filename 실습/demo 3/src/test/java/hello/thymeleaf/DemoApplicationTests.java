package hello.thymeleaf;

import hello.thymeleaf.class1.Member;
import hello.thymeleaf.class1.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {
	MemberRepository repository = new MemberRepository();

	@Test
	public void save(){
		Member member = new Member();
		member.setName("멋사");
		repository.save(member);

		Member result = repository.findByName("멋사").get();
		assertEquals(member , result);
	}
}
