import org.junit.*;
import static org.junit.Assert.*;
public class oderItemClassTest {
  @Test
    public void testOrderItem(){
      OrderItem orderItem = new orderItem(123,IMG);
      String num = OrderItem.getNumber();
      String cod = OrderItem.getCode();
      assertEquals("123",num);
      assertEquals("IMG",cod);

  }

}
