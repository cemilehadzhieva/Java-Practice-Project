package donguler;
import java.util.Scanner;


public class kuvvet {
    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz : ");
        n = input.nextInt();
        for (int i = 1; i <= n; i*=20){
            System.out.println(i);
        }

    }
}
