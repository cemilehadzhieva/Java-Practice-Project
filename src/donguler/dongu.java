package donguler;


import java.util.Scanner;

public class dongu {
    public static void main(String[] args) {
        int sayi, ortalama, sayac = 0, toplam = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen sayı giriniz.");
        sayi = input.nextInt();
        for (int i = 0; i < sayi; i++) {
            if (i % 3 == 0) {
                if (i % 4 == 0) {
                    toplam = toplam + i;
                    sayac = sayac + 1;
                }

            }
        }
        ortalama = toplam / sayac;
        System.out.println("Ortalama" + " " + ortalama);
    }
}












