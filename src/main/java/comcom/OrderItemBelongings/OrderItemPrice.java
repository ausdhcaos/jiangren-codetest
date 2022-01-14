package comcom.OrderItemBelongings;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItemPrice {
    public double doublePrice;
    public int intPrice;
    int imgColumn[] = {800, 450};
    double audColumn[] = {1147.50, 810, 427.50};
    int vidColumn[] = {1530, 900, 570};


    public void calculatePrice(String code, String[] standardCode, BundleItems bundleItems) {
        if (code.trim().equals(standardCode[0])) {
            intPrice = bundleItems.firBundleItem * imgColumn[0] + bundleItems.secBundleItem * imgColumn[1];

        }
        if (code.trim().equals(standardCode[1])) {

            doublePrice = bundleItems.firBundleItem * audColumn[0] + bundleItems.firBundleItem * audColumn[1] + bundleItems.firBundleItem * audColumn[2];

        }
        if (code.trim().equals(standardCode[2])) {
            intPrice = bundleItems.firBundleItem * vidColumn[0] + bundleItems.secBundleItem * vidColumn[1] + bundleItems.secBundleItem * vidColumn[2];
        }


    }

}
