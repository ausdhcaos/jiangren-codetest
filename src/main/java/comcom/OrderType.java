package comcom;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderType {
    String [] standardCode={"IMG","FLAC","VID"};
    String currentCode;
    public String checkCurrentCode(String code)
    {
        for(int i=0;i< standardCode.length;i++)
        {
            if(code.trim().equals(standardCode[i]))
            {
                currentCode= standardCode[i];
            }
        }
        return currentCode;
    }





}
