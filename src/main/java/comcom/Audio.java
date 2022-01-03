package comcom;

public class Audio {
    private int bundle_3=0;
    private int bundle_6=0;
    private int bundle_9=0;
    private int total_number;


    public int getBundle_3(){
        return bundle_3;
    }
    public int getBundle_6(){return bundle_6;}
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
            if (A[i].trim().equals("FLAC")){
                index=i;
            }
        }
        return index;
    }


    public double calculate(int number){
        double price=0;
        if (0<number&&number<=3){
            price = 427.50;
            bundle_3=1;
        }

        if (number>3&&number<=6){
            price = 810;
            bundle_6=1;
        }

        if (number>6&&number<=9){
            price = 1147.50;
            bundle_9=1;
        }

        if (number>9){
            int how_many_nines= number/9;
            if(number%9>6){
                price = 1147.50*(how_many_nines+1);
                bundle_9=how_many_nines+1;
            }
            else if(3<number%9&&number%9<=6){
                price = 1147.50*how_many_nines+810;
                bundle_9=how_many_nines;
                bundle_6=1;
            }
            else if (number%9==0){
                price = how_many_nines*1147.50;
                bundle_9=how_many_nines;
            }
            else if (number%9<=3&&number%9>0){
                price = 1147.50*how_many_nines+427.50;
                bundle_9=how_many_nines;
                bundle_3=1;
            }
        }

        return price;
    }

}
