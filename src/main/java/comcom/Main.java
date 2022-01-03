package comcom;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter bundles");
        Scanner fir_input = new Scanner(System.in);
        Scanner sec_input = new Scanner(System.in);
        Scanner trd_input = new Scanner(System.in);// Create a Scanner object

       int num_array[] = new int[]{
               fir_input.nextInt(),
               sec_input.nextInt(),
               trd_input.nextInt(),
       };

        String code_array[]= new String[]{
                fir_input.nextLine(),
                sec_input.nextLine(),
                trd_input.nextLine(),
        };
//        for (int i =0; i<3;i++)
//        {
//            System.out.println(num_array[i]);
//        }
//
//        for (int i =0; i<3;i++)
//        {
//            System.out.println(code_array[i].trim());
//        }


        Image img_obj = new Image();
        int img_index= img_obj.get_index(code_array);
        img_obj.setTotal_number(num_array[img_index]);

        System.out.println(img_obj.getTotal_number()+" IMG $" +img_obj.calculate(img_obj.getTotal_number()) );
        System.out.println(img_obj.getBundle_10()+" x 10 $"+800*img_obj.getBundle_10());
        System.out.println(img_obj.getBundle_5()+" x 5 $"+450*img_obj.getBundle_5());
        System.out.println("");


        Audio aud_obj = new Audio();
        int aud_index= aud_obj.get_index(code_array);

        aud_obj.setTotal_number(num_array[aud_index]);
        System.out.println(aud_obj.getTotal_number()+" FLAC $" +aud_obj.calculate(aud_obj.getTotal_number()) );
        System.out.println(aud_obj.getBundle_9()+" x 9 $"+1147.50*aud_obj.getBundle_9());
        System.out.println(aud_obj.getBundle_6()+" x 6 $"+810*aud_obj.getBundle_6());
        System.out.println(aud_obj.getBundle_3()+" x 3 $"+427.50*aud_obj.getBundle_3());
        System.out.println("");

        Video vid_obj = new Video();
        int vid_index= vid_obj.get_index(code_array);

        vid_obj.setTotal_number(num_array[vid_index]);
        System.out.println(vid_obj.getTotal_number()+" VID $" +vid_obj.calculate(vid_obj.getTotal_number()) );
        System.out.println(vid_obj.getBundle_9()+" x 9 $"+1530*vid_obj.getBundle_9());
        System.out.println(vid_obj.getBundle_5()+" x 5 $"+900*vid_obj.getBundle_5());
        System.out.println(vid_obj.getBundle_3()+" x 3 $"+570*vid_obj.getBundle_3());





    }
}

