package Practice01;

import java.util.Scanner;

public class Q01_StringManipulation {
    public static void main(String[] args) {
        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("cumle olusturmak icin 1.kelimeyi girin: ");
        String str1= scan.next();
        System.out.println("cumle olusturmak icin 2.kelimeyi girin: ");
        String str2= scan.next();
        System.out.println("cumle olusturmak icin 3.kelimeyi girin: ");
        String str3= scan.next();
        System.out.println("cumle olusturmak icin 4.kelimeyi girin: ");
        String str4= scan.next();
        System.out.println(str1.substring(0,1).toUpperCase()+ str1.substring(1)+" "+str2+" "+str3+" "+str4+".");

    }
}
