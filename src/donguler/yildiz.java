package donguler;
import java.util.Scanner;

public class yildiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz :");
        int n = input.nextInt();



        for (int i = 1; i <= 6; i++){
            for (int k = 1; k <= (n-i); k++){
                System.out.print(" ");
                }
            for (int l = 1; l <= (2*i) - 1; l++){
                System.out.print("*");

            }
            System.out.println();

        }

        for(int j = 5; j > 0; j--){
            for(int m = 5; m>= j; m--){
                System.out.print(" ");
            }
            for (int g = (2*j) - 1; g >= 1; g-- ){
                System.out.print("*");
            }
            System.out.println();


        }

    }
}
