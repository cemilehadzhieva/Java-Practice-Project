package odev;
import java.util.Scanner;

public class kullanıcıgirisi {
    public static void main(String[] args) {
        String userName,password;



        Scanner inp = new Scanner(System.in);

        System.out.println("Kullanıcı Adınız :");
        userName = inp.nextLine();

        System.out.println("Şifreniz :");
        password = inp.nextLine();

        if (userName.equals("patika")){
            if (password.equals("java123")){
                System.out.println("Giriş Yaptınız !");
            }else{
                System.out.println("Şifenizi sıfırlamak ister misiniz?");

                String verify = inp.nextLine();
                System.out.println(verify);

                if (verify.equals("evet")){
                    System.out.println("Yeni şifrenizi girin :");
                    String oldPass = password;
                    password = inp.next();
                    if (!oldPass.equals(password)&& !password.equals("java123")){
                        System.out.println("Şifreniz oluşturuldu.");
                    }else{
                        System.out.println("Şifreniz oluşturulamadı. Lütfen başka şifre giriniz.");
                    }
                }
            }
        }else {
            System.out.println("Bilgileriniz yanlış");
        }

        }






}