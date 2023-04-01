package Practice04;

import java.util.Scanner;

public class Q10_Interview {
    public static void main(String[] args) {
        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini
         * yine kulanicidan alinan sayi kadar return eden metod yaziniz
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir string girin");
        String input=scan.nextLine();
        System.out.println("lutfen bir sayi girin");
        int sayi=scan.nextInt();

        ilkSonHarf(input,sayi);
        System.out.println("ilkSonHarf(input,sayi)="+ilkSonHarf(input,sayi));
    }

    private static String ilkSonHarf(String str, int n) {
      String s=str.substring(0,1)+str.substring(str.length()-1);
      String sonuc="";

        for (int i = 1; i <=n ; i++) {
            sonuc=sonuc+ s;//sonuc+=s;

        }

        return sonuc;


        /*
        input yerine str sayi yerine n kullanabiliriz, değismez.
         bu method ilkSonHarf e tanımlı, sadece isimleri farklı
         */
    }
}
