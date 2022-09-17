package odev;
import java.util.Scanner;


public class hesap {
    public static void main(String[] args) {
        int n1,n2,select;


        Scanner input = new Scanner(System.in);
        System.out.println("İlk Sayıyı Giriniz :");
        n1 = input.nextInt();
        System.out.println("İkinci Sayıyı Giriniz :");
        n2 = input.nextInt();

        System.out.println("1-Toplam\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz: ");
        select =input.nextInt();
        input.close();




        switch (select){
            case 1:
            System.out.println("Toplam :" + (n1 + n2));
            break;
            case 2:
            System.out.println("Çıkarma:" + (n1 - n2));
            break;
            case 3:
            System.out.println("Çarpma:" + (n1 * n2));
            break;
            case 4:


            default:
                System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz.");
                switch (n2){
            case  0:
                System.out.println("Bir sayı sıfıra bölünemez.");
            break;
            default:
                System.out.println("Sonuç:" + n1/n2);

                }
                break;



        }

    }

    }

