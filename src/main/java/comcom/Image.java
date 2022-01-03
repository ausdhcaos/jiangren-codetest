package comcom;

import static java.lang.Character.isDigit;

public class Image {

    private int bundle_5=0;
    private int bundle_10;
    private int total_number;


    public int getBundle_5(){
        return bundle_5;
    }
    public int getBundle_10(){
        return bundle_10;
    }

    public void setTotal_number(int num) {
        this.total_number = num;
    }
    public int getTotal_number(){
        return total_number;
    }

    public int get_index(String A[])
       {
           int index =0;
           for(int i =0;i<3;i++){
               if (A[i].trim().equals("IMG")){
                   index=i;
               }
           }
           return index;
       }


    public int calculate(int number){
        int price=0;
        if (0<number&&number<=5){
            price = 450;
            bundle_5=1;
        }

        if (number>5&&number<=10){
            price = 800;
            bundle_10=1;
        }

        if (number>10){
            int how_many_tens= number/10;
            if(number%10>5){
                price = 800*(how_many_tens+1);
                bundle_10=how_many_tens+1;
            }
            if (number%10==0){
                price = how_many_tens*800;
                bundle_10=how_many_tens;
            }
            if (number%10>0&&number%10<=5){
                price = 800*how_many_tens + 450;
                bundle_10=how_many_tens;
                bundle_5=1;
            }
        }

        return price;
    }



}
