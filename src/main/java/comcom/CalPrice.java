package comcom;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CalPrice {
    double doublePrice;
    int intPrice;
    int imgColumn[]={800,450};
    double audColumn[]={1147.50,810,427.50};
    int vidColumn[]={1530,900,570};

    public void calculatePrice(String code,int b1,int b2,int b3){
        if(code.trim().equals("IMG")){
            intPrice=b1*imgColumn[0]+b2*imgColumn[1];
        }
        if(code.trim().equals("FLAC")){
            doublePrice=b1*audColumn[0]+b2*audColumn[1]+b3*audColumn[2];
        }
        if(code.trim().equals("VID")){
            intPrice=b1*vidColumn[0]+b2*vidColumn[1]+b3*vidColumn[2];
        }
    }

}
