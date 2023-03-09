package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        //MemberService를 만드는데, new해서 MemberServiceImpl을 선택을 해줌

        Member member = new Member(1L, "memberA", Grade.VIP);
        //Ctrl+ Alt + v

        memberService.join(member);
        //join해서 넣으면, 회원가입이 되겠죠

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find Member= " + findMember.getName());

    }
}
