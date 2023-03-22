package day01_recap;

import java.util.Scanner;

public class Q16_BMI {
    public static void main(String[] args) {
         /*
		 Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut
		 Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		 ORNEK:
		 INPUT      : Kilo: 71
		              Boy: 1,72
		 OUTPUT  : Vucut Kitle Indeksiniz : 23
		 	 */

        Scanner scan=new Scanner(System.in);
        System.out.println("kilonuzu girin(kg)");
        double kilo=scan.nextDouble();

        System.out.println("boyunuzu girin(cm)");
        double boy=scan.nextDouble();
        boy/=100;
        double vke=kilo/(boy*boy);
        System.out.println("vke = " + vke);





        }
    }

