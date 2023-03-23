package day02_recap;

import java.util.Scanner;

public class Q03_BMISiniflama {
    public static void main(String[] args) {
         /*
              *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
              *
             BMI = kilo(kg) /(boy*boy)(cm)
             BMI <=20 oldukca zayifsiniz
             20<BMI<=25 Normal sinirlardasiniz
             25<BMI<=30 Sisman kategorisindesiniz
             30<BMI ==> Obez grubundasiniz.
               */
        Scanner scan=new Scanner(System.in);
        System.out.print("kilonuz: ");
        double kilo= scan.nextDouble();
        System.out.print("boyunuz: ");
        double boy= scan.nextDouble()/100;
        double bmi=kilo/(boy*boy);

        if(bmi<=20) {
            System.out.println("oldukca zayifsiniz");
        }else if(bmi<=25) {
            System.out.println("Normal sinirlardasiniz");
        }else if(bmi<=30) {
            System.out.println("Sisman kategorisindesiniz");
        }else if(bmi>30) {
            System.out.println("Obez grubundasiniz.");
        }



    }
}
