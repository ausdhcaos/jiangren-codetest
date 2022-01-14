package comcom.OrderItemBelongings;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BundleType {
    int[] imgBundleType = {10, 5};
    int[] audBundleType = {9, 6, 3};
    int[] vidBundleType = {9, 5, 3};

    int[] currentType = {0};


    public void calBundleTypes(String[] standardCode, String currentCode) {
        int index = 0;

        for (int i = 0; i < standardCode.length; i++) {
            if (currentCode.trim().equals(standardCode[i].trim())) {
                index = i;
            }
        }
        switch (index) {
            case 0:
                currentType = imgBundleType;
                break;
            case 1:
                currentType = audBundleType;
                break;
            case 2:
                currentType = vidBundleType;
                break;
        }

    }

}
