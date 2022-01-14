package comcom.OrderItemBelongings;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItemType {
    String[] standardCode = {"IMG", "FLAC", "VID"};
    String currentCode;

    public void checkCurrentCode(String code) {
        for (int i = 0; i < standardCode.length; i++) {
            if (code.trim().equals(standardCode[i])) {
                currentCode = standardCode[i];
            }
        }
    }


}
