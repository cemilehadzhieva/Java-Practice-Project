import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenleri oluştur
        int kenar1, kenar2, kenar3;
        // Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdam değerleri al
        System.out.print("kenar 1 : ");
        kenar1 = inp.nextInt();

        System.out.print("kenar 2: ");
        kenar2 = inp.nextInt();

        System.out.print("kenar 3 :");
        kenar3 = inp.nextInt();



        double u = (kenar3 + kenar2 +kenar1)/2;
        double alan = Math.sqrt(u * (u-kenar3) * (u-kenar2) * (u - kenar1));
        System.out.print("Alan =" + alan);





    }

}

