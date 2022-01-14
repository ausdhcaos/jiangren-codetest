package comcom;
import comcom.OrderItemBelongings.BundleItems;
import comcom.OrderItemBelongings.BundleType;
import comcom.OrderItemBelongings.OrderItemPrice;
import comcom.OrderItemBelongings.OrderItemType;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class OrderItem {
    String number;
    String code;

    public OrderItemType orderItemType = new OrderItemType();
    public BundleType bundleType = new BundleType();
    public BundleItems bundleItems = new BundleItems();
    public OrderItemPrice orderItemPrice = new OrderItemPrice();

    public OrderItem(String[] input) {
        number = input[0];
        code = input[1];
    }
}
