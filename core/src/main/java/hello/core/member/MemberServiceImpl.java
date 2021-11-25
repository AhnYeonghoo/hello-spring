package hello.core.member;

public class MemberServiceImpl implements MemberService {

    /*
    회원가입, 조회하기 위한 회원정보 객체가 필요
     */
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
