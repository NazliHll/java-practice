package day02_recap;

import java.util.Scanner;

public class Q10_StringManipulation {
    public static void main(String[] args) {
        //kullanicidan ismini ve soyismini girmesini isteyin,sonrasinda konsola tam ismini buyuk harflerle yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi ve soyisminizi girin");
        String firstName= scan.nextLine(),
                lastName=scan.nextLine();
        String fullName=firstName.concat(" "+lastName).toUpperCase();
        System.out.println("fullName = " + fullName);

    }
}
