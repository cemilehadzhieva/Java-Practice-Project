package ödev;

import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
      int armut, elma,domates, muz, patlican;




        Scanner inp = new Scanner(System.in);



        System.out.println("Armut Kaç Kilo ?");
        armut = inp.nextInt();

        System.out.println("Elma Kaç Kilo ?");
        elma = inp.nextInt();

        System.out.println("Domates Kaç Kilo ? ");
        domates = inp.nextInt();

        System.out.println("Muz Kaç Kilo ?");
        muz = inp.nextInt();

        System.out.println("Patlıcan Kaç Kilo ?");
        patlican = inp.nextInt();

        double toplam= (elma*3.67) + (armut*2.14) +(domates*1.11) + (muz*0.95) +(patlican*5.00);
        System.out.println("Toplam tutar :" + toplam);





    }
}
