package comcom;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Order {

    public List<OrderItem> OrderItemList=new ArrayList<OrderItem>();

}
