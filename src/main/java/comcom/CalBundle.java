package comcom;
import lombok.Getter;
import lombok.Setter;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Setter
public class CalBundle {
    int number;
    int bundle_1 = 0;
    int bundle_2 = 0;
    int bundle_3 = 0;


    public void mainCal(int number,int[] bundleType){
        int kind= bundleType.length;
        switch(kind){
            case 2:
                twoBundleCal(number,bundleType);

                break;
            case 3:
                threeBundleCal(number,bundleType);

                break;
        }

    }

    public void twoBundleCal(int number,int []bundleType){
        if(number>bundleType[0]) {
            cal_fir(number, bundleType[0]);
            cal_sec(number%bundleType[0],bundleType[1]);
        }
        else
        {
            cal_sec(number,bundleType[1]);
        }
    }

    public void threeBundleCal(int number,int []bundleType){
        if(number>bundleType[0]) {
            cal_fir(number, bundleType[0]);
            calThreeBUndlesSec(number%bundleType[0],bundleType[1],bundleType[2]);
        }
    }

    public void cal_fir(int number,int b1){
        bundle_1= number/b1;
    }

    public void cal_sec(int number,int b2){
            if(number>b2){
                bundle_1++;
            }
            else{
                bundle_2=1;
            }
    }

    public void calThreeBUndlesSec(int number,int b2,int b3){
        if(number>b2)
        {
            bundle_1++;
        }
        else if(number<=b3)
        {
            bundle_3=1;
        }
        else
        {
            bundle_2=1;
        }
    }


}
//        for(int i=0;i<bundleSize;i++)
//        {
//            if(number>bundles[i])
//            {
//                int x= number/bundles[i];
//                bundleResult[i]=x;
//                int y= number%bundles[i];
//                if(y>bundles[i+1]){
//                    bundleResult[i]++;
//                }
//                else{number=y;}
//            }
//            if(number<bundles[i])
//            {
//               for(int j=bundles.length-1;j>0;j--)
//               {
//                   if(number<=bundles[j])
//                   {
//                       bundleResult[i]=1;
//                   }
//               }
//            }
//

//        result = java.util.Arrays.toString(bundleResult);
//        return result;




