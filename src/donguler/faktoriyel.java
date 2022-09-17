package donguler;
import java.util.Scanner;

public class faktoriyel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kümenin elaman sayısı : ");
        int n = scan.nextInt();
        System.out.print("Farklı grup sayısı :");
        int r = scan.nextInt();
        int total = 1;
        int total2= 1;
        int total3 = 1;

        for (int i = 1; i <= n; i++){
            total = total * i;





            }
        for (int k = 1; k <= r; k++){
            total2 = total2 * k;
        }
        for (int d = 1; d <= (n-r); d++){
            total3 = total3 * d;
        }
        double sonuc = total / (total2 * total3);

        System.out.println(n + ". Kombinasyon :" + sonuc);

        }
    }



