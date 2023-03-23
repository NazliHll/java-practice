package day01_recap;

import java.util.Scanner;

public class Q08_Scanner01 {
    public static void main(String[] args) {
         /*
         kullanicidan 2 tam sayi alin
         bu tam sayilari toplayin ve sonucu yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("1.sayiyi girin: ");
        int sayi1=scan.nextInt();
        System.out.print("2.sayiyi girin: ");
        int sayi2=scan.nextInt();
        int top=sayi1+sayi2;
        System.out.println("toplam = " + top);







    }
}
