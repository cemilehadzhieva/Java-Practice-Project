package odev;

import java.util.Scanner;

public class ucak {
    public static void main(String[] args) {
        int mesafe, yas;
        double indirimliTutar = 0;

        System.out.println("Lütfen mesafeyi girniz(km) :" );
        Scanner sp = new Scanner(System.in);
        mesafe = sp.nextInt();
        System.out.println("Lütfen yaşınızı giriniz :" );
        yas = sp.nextInt();

        System.out.println("Lütfen yolculuk tipini girniz :" );
        int yolculukTipi = sp.nextInt();

        if(mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)){
            System.out.println("Hatalı veri girdiniz!");
            return;
        }

        double normalTutar = mesafe * 0.10;
        if (yas < 12){
            double yasIndirmi = normalTutar * 0.5;
            indirimliTutar = normalTutar - yasIndirmi;
        } else if (yas >= 12 && yas <= 24) {
            double yasIndirmi = normalTutar * 0.10;
            indirimliTutar = normalTutar - yasIndirmi;
        } else if (yas > 65) {
            double yasIndirmi = normalTutar * 0.30;
            indirimliTutar = normalTutar - yasIndirmi;
        }else{
            indirimliTutar = normalTutar;
        }

        double toplamTutar = 0;

        if (yolculukTipi == 2 ){
            double yonIndirimi = indirimliTutar * 0.20;
            toplamTutar = (indirimliTutar - yonIndirimi) * 2;

        }else if(yolculukTipi == 1 ){
            toplamTutar = indirimliTutar;
        }



        System.out.println("Toplam Tutar : " + toplamTutar + "TL");



    }
}
