package day02_recap;

import java.util.Scanner;

public class Q01_Scanner {
    public static void main(String[] args) {
         /*  Problem Tanımı
           Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
         a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz
         Örnek Ekran Çıktısı
         a sayısını giriniz: 5
         b sayısını giriniz: 3
         c sayısını giriniz: 1
         sonuç : 5.333333333333333
        */
        Scanner scan=new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.print("a sayisini girin: ");
        a=scan.nextDouble();
        System.out.print("b sayisini girin: ");
        b=scan.nextDouble();
        System.out.print("c sayisini girin: ");
        c= scan.nextDouble();
        double sonuc=((a*a)-(b*b))/(3*c);
        System.out.print("sonuc = " + sonuc);

    }
}
