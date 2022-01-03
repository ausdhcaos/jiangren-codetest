package comcom;

public class Video {

    private int bundle_3=0;
    private int bundle_5 =0;
    private int bundle_9=0;
    private int total_number;


    public int getBundle_3(){
        return bundle_3;
    }
    public int getBundle_5(){return bundle_5;}
    public int getBundle_9(){return bundle_9;}


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
            if (A[i].trim().equals("VID")){
                index=i;
            }
        }
        return index;
    }


    public int calculate(int number){
        int price=0;
        if (0<number&&number<=3){
            price = 570;
            bundle_3=1;
        }

        if (number>3&&number<=5){
            price = 900;
            bundle_5 =1;
        }

        if (number>5&&number<=9){
            price = 1530;
            bundle_9=1;
        }
                    //     1 2 3| 4 5| 6 7 8
        if (number>9){
            int how_many_nines= number/9;
            if(number%9>5){
                price = 1530*(how_many_nines+1);
                bundle_9=how_many_nines+1;
            }
            else if(3<number%9&&number%9<=5){
                price = 1530*how_many_nines+900;
                bundle_9=how_many_nines;
                bundle_5 =1;
            }
            else if (number%9==0){
                price = how_many_nines*1530;
                bundle_9=how_many_nines;
            }
            else if (number%9<=3&&number%9>0){
                price = 1530*how_many_nines+570;
                bundle_9=how_many_nines;
                bundle_3=1;
            }
        }

        return price;
    }
}
