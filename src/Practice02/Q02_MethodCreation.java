package Practice02;

import java.util.Scanner;

public class Q02_MethodCreation {
    public static void main(String[] args) {
         /*
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
      */
        Scanner scan =new Scanner(System.in);
        System.out.println("metre ve kmye donusturmek istediginiz cm degerini girin");
        double cmValue= scan.nextDouble();

        convertSM(cmValue);

    }

    public static void convertSM(double cmValue) {
        double meter=cmValue/100;
        double kMeter=cmValue/100000;
        System.out.println("girdiginiz cm degeri: "+cmValue +" "+ meter+" metredir "+ kMeter+ " kmdir" );
        }
    }

