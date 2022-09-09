package proje2;

import java.util.Scanner;


public class proje2 {

    public static void main(String[] args) {
        int KDVsiz,KDVli ,KDV;
        Scanner inp = new Scanner(System.in);

        System.out.print("KDV'siz Fiyat");
        KDVsiz = inp.nextInt();


        double  hesap1 = KDVsiz *(double) 18/100 + KDVsiz;



        boolean kosul = KDVsiz > 1000;
        double hesap2 = KDVsiz * (double)8/100 + KDVsiz;

        double sonuc = kosul ? hesap2 : hesap1;
        System.out.print("KDV'li Fiyat =" + sonuc);













    }



    }


