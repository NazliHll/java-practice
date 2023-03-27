package Practice01;

import java.util.Scanner;

public class Q05_StringManipulation {
    public static void main(String[] args) {
        /*
        Kullanicidan isim ve soyismini girmesini isteyin
         ve hangisinin daha uzun oldugunu yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi ve soyisminizi giriniz :\nisim");
        String isim=scan.nextLine();
        System.out.println("soyisim");
        String soyisim=scan.next();

        if(isim.length()>soyisim.length()) {
            System.out.println("isminiz soyisminizden uzun");
        }else if(isim.length()==soyisim.length()){
            System.out.println("isminiz soyisminize esit");
        }else System.out.println("soyisminiz isminizden uzun");
    }
}
