package odev;
import java.util.Scanner;



public class daire {
    public static void main(String[] args) {
       int r,a;
       double pi = 3.14;


       Scanner inp = new Scanner(System.in);
       System.out.println("Dairenin Yarıçapını giriniz : ");
       Scanner inpo = new Scanner(System.in);
       System.out.println("Merkez açısnın ölçüsünü girirniz : ");

       r = inp.nextInt();
       a = inp.nextInt();
       double alan = (pi * (r*r) * a)/360;


       System.out.println("Daire diliminin alanı : "+ alan);






    }
}
