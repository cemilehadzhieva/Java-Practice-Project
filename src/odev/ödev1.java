package odev;

import java.util.Scanner;

public class ödev1 {
    public static void main(String[] args) {
        int kilo;
        double boy;
        Scanner inp= new Scanner(System.in);

        System.out.print("Kilonuz:");
        kilo = inp.nextInt();

        System.out.print("Boyunuz:");
        boy = inp.nextDouble();



        double sonuc= (double) kilo/( boy*boy);
        System.out.print("Vücüt Kitle İndeksiniz :" + sonuc);








    }
}
