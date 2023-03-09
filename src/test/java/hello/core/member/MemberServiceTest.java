package hello.core.member;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join(){
        //given(이런 이런 환경이 주어졌을 떄 )
        Member member = new Member(1L, "memberA",Grade.VIP);

        //when(이렇게 했을 때 )
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //then(이렇게 된다)
        Assertions.assertThat(member).isEqualTo(findMember);
        //join한거랑 찾은거랑 똑같으면은 테스트가, 넣고 빼는 것이 되는 거겠죠
    }
}
