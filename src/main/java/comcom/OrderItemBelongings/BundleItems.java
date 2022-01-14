package comcom.OrderItemBelongings;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BundleItems {
    // int number;
    int firBundleItem = 0;
    int secBundleItem = 0;
    int trdBundleItem = 0;


    public void mainCal(String strNumber, int[] bundleType) {
        int kind = bundleType.length;
        int number = Integer.valueOf(strNumber);
        switch (kind) {
            case 2:
                twoBundleCal(number, bundleType);

                break;
            case 3:
                threeBundleCal(number, bundleType);

                break;
        }

    }

    public void twoBundleCal(int number, int[] bundleType) {
        if (number > bundleType[0]) {
            cal_fir(number, bundleType[0]);
            cal_sec(number % bundleType[0], bundleType[1]);
        } else {
            cal_sec(number, bundleType[1]);
        }
    }

    public void threeBundleCal(int number, int[] bundleType) {
        if (number > bundleType[0]) {
            cal_fir(number, bundleType[0]);
            calThreeBUndlesSec(number % bundleType[0], bundleType[1], bundleType[2]);
        }
    }

    public void cal_fir(int number, int b1) {
        firBundleItem = number / b1;
    }

    public void cal_sec(int number, int b2) {
        if (number > b2) {
            firBundleItem++;
        } else {
            secBundleItem = 1;
        }
    }

    public void calThreeBUndlesSec(int number, int b2, int b3) {
        if (number > b2) {
            firBundleItem++;
        } else if (number <= b3) {
            trdBundleItem = 1;
        } else {
            secBundleItem = 1;
        }
    }


}
