package Practice08.okul_proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris {
     /*
    * ogretmen bilgilerini kullanicidan aliniz
    * aldiginiz bilgilerrden object ureterek yeni
     ogretmenler olusturun ve bilgilerini yazdirin
    */
     public static void main(String[] args) {
         System.out.println("hosgeldiniz okulumuza ");
         System.out.println("isim giriniz");
         Scanner scan=new Scanner(System.in);
         String isim=scan.nextLine();
         System.out.println("soyisim giriniz");
         String soyisim=scan.nextLine();
         System.out.println("yasinizi giriniz");
         int yas=scan.nextInt();

         scan.nextLine();//dummy hayalet komut

         System.out.println("bransinizi giriniz");
         String brans=scan.nextLine();

         System.out.println("tel no giriniz");
         String tel=scan.nextLine();

         OgretmenBilgileri adayOgretmen=new OgretmenBilgileri(isim,soyisim,yas,brans,tel);
         List<OgretmenBilgileri> ogretmenList=new ArrayList<>();
         ogretmenList.add(adayOgretmen);
         System.out.println("ogretmenList = " + ogretmenList);



     }
}
