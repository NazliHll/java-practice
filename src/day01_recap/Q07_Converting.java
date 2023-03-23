package day01_recap;

import java.util.Scanner;

public class Q07_Converting {
    public static void main(String[] args) {
         /*
      Soru 1 -) galonu litreye ceviren bir java programi yaziniz
                1 gallon = 3.785 litre
                litreyi galona ceviren bir java programi yaziniz
                  1 litre = 1/3.785 gallon
      */
        int gallon = 1000;
        double litre = gallon * 3.785;
        String sonuc1 = gallon + " gallon değeri " + litre + " litreye eşittir";
        System.out.println(sonuc1);

        int l = 1000;
        double g = l / 3.785;
        System.out.println(l + " litre degeri " + g + " gallona esittir ");

        /*
        Soru 2 -) Sıcaklığı Fahrenhayt'tan Santigrat derecesine
        çeviren bir Java programı yazın.
         formül
             c = (f-32)*5/9
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("fahrenayt degerini giriniz");
        double fh=scan.nextDouble();
        System.out.println("girdiginiz fahrenayt degeri : "+(fh-32)*5/9+" santigrattır");

        }







    }
