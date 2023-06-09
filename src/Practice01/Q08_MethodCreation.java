package Practice01;

import java.util.Scanner;

public class Q08_MethodCreation {
    public static void main(String[] args) {
        /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */
        Scanner scan=new Scanner(System.in);
        System.out.println("yapacaginiz 4 islemi + - * / olarak secin");
        char islem=scan.next().charAt(0);

        System.out.println("1.sayi: ");
        double num1=scan.nextDouble();
        System.out.println("2.sayi: ");
        double num2=scan.nextDouble();

        hesapMakinesi(islem,num1,num2);

    }

    public static void hesapMakinesi(char islem, double num1, double num2) {
        if(islem=='+' || islem=='*' || islem=='-' || islem=='/'){
            switch (islem){
                case '+':
                    System.out.println(num1+"+"+ num2+"="+(num1+num2));
                    break;
                case '-':
                    System.out.println(num1+"-"+ num2+"="+(num1-num2));
                    break;
                case '/':
                    System.out.println(num1+"/"+ num2+"="+(num1/num2));
                    break;
                case '*':
                    System.out.println(num1+"*"+ num2+"="+(num1*num2));
                    break;


            }
        }else System.out.println("hatali islem yaptiniz");
    }
}
