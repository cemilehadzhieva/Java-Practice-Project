package ödev;
import java.util.Scanner;


public class sinifGecme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mat, fizik, turkce, kimya, muzik;
        int toplamDers = 0;
        int toplamNot = 0;
        int average;


        System.out.println("Matematik notunuz: ");
        mat = input.nextInt();
        if (!(mat< 0 || mat > 100)){
            toplamNot += mat;
            toplamDers ++;
        }else{
            System.out.println("Notunuz o ile 100 arasında olmalıdır.");
        }

        System.out.println("Türkçe notunuz: ");
        turkce = input.nextInt();
        if (!(turkce < 0|| turkce > 100)){
            toplamNot += turkce;
            toplamDers += 1;

        }else{
            System.out.println("Notunuz 0 il 100 arasında olmalıdır.");
        }

        System.out.println("Fizik notunuz: ");
        fizik = input.nextInt();
        if (!( fizik < 0|| fizik > 100)){
            toplamNot += fizik;
            toplamDers += 1;

        }else{
            System.out.println("Notunuz 0 il 100 arasında olmalıdır.");
        }

        System.out.println("Kimya notunuz: ");
        kimya = input.nextInt();
        if (!(kimya < 0|| turkce > 100)){
            toplamNot += kimya;
            toplamDers += 1;

        }else{
            System.out.println("Notunuz 0 il 100 arasında olmalıdır.");
        }

        System.out.println("Müzük notunuz: ");
        muzik = input.nextInt();
        if (!(muzik < 0|| muzik > 100)){
            toplamNot += muzik;
            toplamDers += 1;

        }else{
            System.out.println("Notunuz 0 il 100 arasında olmalıdır.");
        }

        average = toplamNot/toplamDers;
        if ((average <= 55)){
            System.out.println("Sınıfı geçemediniz.");


        }else{
            System.out.println("Tebrikler sınıfı geçtiniz.");
        }
        System.out.println("Ortalamanız:" + average);





    }
}







