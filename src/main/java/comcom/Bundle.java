package comcom;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bundle {

    public Bundle(int num, String nam){
        this.inputNum = num;
        this.name = nam;
    }

    String keyword[]={"IMG","FLAC","VID"};
    int imgColumn[]={450,800};
    double audColumn[]={427.50,810,1147.50};
    int vidColumn[]={570,900,1530};
    int imgType[]={5,10};
    int audType[]={3,6,9};
    int vidType[]={3,5,9};
    String name;
    int inputNum;
    int intPrice;
    double doublePrice;
    int bundle_1;
    int bundle_2;
    int bundle_3;

    public void calBundle(Bundle b){
        String type=b.name;
        intPrice =calculate(b.inputNum,b);
        if (type.trim().equals(keyword[0])){
          intPrice =calculate(b.inputNum,b);
            System.out.println(b.inputNum + keyword[0]+" $"+ intPrice);
            System.out.println(bundle_2+" x"+ imgType[1] +" = "+bundle_2*imgColumn[1]);
            System.out.println(bundle_1+" x"+ imgType[0] +" = "+bundle_1*imgColumn[0]);
            }
        if (type.trim().equals(keyword[1])){
            doublePrice =calculate(b.inputNum,b);
            System.out.println(b.inputNum + keyword[1]+" $"+ doublePrice);
            System.out.println(bundle_3 + " x"+audType[2] +" = "+ bundle_3 *audColumn[2]);
            System.out.println(bundle_2 + " x"+audType[1] +" = "+ bundle_2 *audColumn[1]);
            System.out.println(bundle_1 + " x"+audType[0] +" = "+ bundle_1 *audColumn[0]);
        }
        if (type.trim().equals(keyword[2])){
            intPrice =calculate(b.inputNum,b);
            System.out.println(b.inputNum + keyword[2]  +" $"+ intPrice);
            System.out.println(bundle_3 +" x"+vidType[2] +" = "+ bundle_3 *vidColumn[2]);
            System.out.println(bundle_2 +" x"+vidType[1] +" = "+bundle_2*vidColumn[1]);
            System.out.println(bundle_1 +" x"+vidType[0] +" = "+ bundle_1 *vidColumn[0]);
        }

    }

    public int calculate(int number, Bundle bun){


        int price=0;
        if (bun.name.trim().equals(keyword[0])){
            if (0<number&&number<=imgType[0]){
                price = imgColumn[0];
                bundle_1=1;
            }

            if (number>imgType[0]&&number<=imgType[1]){
                price = imgColumn[1];
                bundle_2=1;
            }

            if (number>imgType[1]){
                int largestBundleNum= number/imgType[1];
                if(number%imgType[1]>imgType[0]){
                    price = imgColumn[1]*(largestBundleNum+1);
                    bundle_2=largestBundleNum+1;
                }
                if (number%imgType[1]==0){
                    price = largestBundleNum*imgColumn[1];
                    bundle_2=largestBundleNum;
                }
                if (number%10>0&&number%imgType[1]<=imgType[0]){
                    price = imgColumn[1]*largestBundleNum + imgColumn[0];
                    bundle_2=largestBundleNum;
                    bundle_1=1;
                }
            }
        }

        if (bun.name.trim().equals(keyword[1])){
            if (0<number&&number<=audType[0]){
                price = (int) Math. round(audColumn[0]);
                bundle_1 =1;
            }

            if (number>audType[0]&&number<=audType[1]){
                price = (int) Math. round(audColumn[1]);
                bundle_2 =1;
            }

            if (number>audType[1]&&number<=audType[2]){
                price = (int) Math. round(audColumn[2]);
                bundle_3 =1;
            }

            if (number>audType[2]){
                int LargestBundleNum= number/audType[2];
                if(number%audType[2]>audType[1]){
                    price = (int) Math.round(audColumn[2]*(LargestBundleNum+1));
                    bundle_3 =LargestBundleNum+1;
                }
                else if(audType[0]<number%audType[2]&&number%audType[2]<=audType[1]){
                    price = (int) Math.round(audColumn[2]*LargestBundleNum+audColumn[1]);
                    bundle_3 =LargestBundleNum;
                    bundle_2 =1;
                }
                else if (number%audType[2]==0){
                    price = (int) Math.round(LargestBundleNum*audColumn[2]);
                    bundle_3 =LargestBundleNum;
                }
                else if (number%audType[2]<=audType[0]&&number%audType[2]>0){
                    price = (int) Math.round(audColumn[2]*LargestBundleNum+audColumn[0]);
                    bundle_3 =LargestBundleNum;
                    bundle_1 =1;
                }
            }
        }

        if (bun.name.trim().equals(keyword[2])){
            if (0<number&&number<=vidType[0]){
                price = vidColumn[0];
                bundle_1 =1;
            }

            if (number>vidType[0]&&number<=vidType[1]){
                price = vidColumn[1];
                bundle_1 =1;
            }

            if (number>vidType[1]&&number<=vidType[2]){
                price = vidColumn[2];
                bundle_3 =1;
            }
            if (number>vidType[2]){
                int LargestBundleNum= number/vidType[2];
                if(number%vidType[2]>vidType[1]){
                    price = vidColumn[2]*(LargestBundleNum+1);
                    bundle_3 =LargestBundleNum+1;
                }
                else if(vidType[0]<number%vidType[2]&&number%vidType[2]<=vidType[1]){
                    price = vidColumn[2]*LargestBundleNum+vidColumn[1];
                    bundle_3 =LargestBundleNum;
                    bundle_2 =1;
                }
                else if (number%vidType[2]==0){
                    price = LargestBundleNum*vidColumn[2];
                    bundle_3 =LargestBundleNum;
                }
                else if (number%vidType[2]<=vidType[1]&&number%vidType[2]>0){
                    price = vidColumn[2]*LargestBundleNum+vidColumn[0];
                    bundle_3 =LargestBundleNum;
                    bundle_1 =1;
                }
            }
        }


        return price;
    }


}


