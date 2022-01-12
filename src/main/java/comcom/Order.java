package comcom;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
    int number;
    String code;
    public Order(int num, String nam){
        this.number = num;
        this.code = nam;
    }
}
