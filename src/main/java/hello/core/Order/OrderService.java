package hello.core.Order;
import hello.core.discount.Order;

public interface OrderService {

    Order createOrder(Long memberId, String itemName, int itemPrice);
}
