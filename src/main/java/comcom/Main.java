package comcom;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        System.out.println("Enter bundles");
        Scanner firInput = new Scanner(System.in);
        Scanner secInput = new Scanner(System.in);
        Scanner trdInput = new Scanner(System.in);// Create a Scanner object

        Bundle b1= new Bundle(firInput.nextInt(), firInput.nextLine());
        b1.calBundle(b1);

        Bundle b2= new Bundle(secInput.nextInt(), secInput.nextLine());
        b2.calBundle(b2);

        Bundle b3= new Bundle(trdInput.nextInt(), trdInput.nextLine());
        b3.calBundle(b3);



    }
}

