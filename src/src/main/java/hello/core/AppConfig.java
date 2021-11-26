package hello.core;
//공연 기획자
import hello.core.Order.OrderService;
import hello.core.Order.OrderServiceImpl;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.*;


/*
DIP를 지키기 위하여 인터페이스의 구현 객체를 직접 생성해준다.
이제부터는 해당 구현체에서 직접 구현체를 생성하지 않아도 됨(생성자를 통해 AppConfig에서 직접 생성자 주입을 함
즉, 각 구현체들은 이제 오로지 인터페이스에만 의존하게 된다.
 */
public class AppConfig {

    //맴버서비스를 반환하는 맴버서비스 메서드 리턴값은 구현체 -> 즉 직접 구현체를 만들어라
    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());    // -> 생성자 주입
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }

}
