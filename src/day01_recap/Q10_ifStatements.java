package day01_recap;

import java.util.Scanner;

public class Q10_ifStatements {
    public static void main(String[] args) {
        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("lutfen Y/N ikilisinden birini girin :");
        char karakter=scan.next().charAt(0);
        if(karakter=='Y'|| karakter=='y'){
            System.out.println("yes");
        }else if(karakter=='N'|| karakter=='n'){
            System.out.println("no");

        }else System.out.println("lutfen sadece y/n girin");



    }
}
