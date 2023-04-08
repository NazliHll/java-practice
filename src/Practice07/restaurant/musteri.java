package Practice07.restaurant;

public class musteri {
    public static void main(String[] args) {
        mutfak menu=new mutfak();
        System.out.println("menu.toString() = " + menu.toString());

        mutfak siparisin=new mutfak("adanakebab","mercimek","kunefe","salgam");

        System.out.println("siparisin: "+siparisin);
    }
}
