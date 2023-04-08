package Practice07.restaurant;

public class mutfak {
    public String yemekler="adanakebab, urfaciger, kusbasi, kusleme";
    public String araSicak="yayla,mercimek,dugun,corba";
    public String tatlilar="baklava, sutlac, kazandibi, kunefe";
    public String icecekler="ayran, salgam, kola";

    public mutfak(String adanakebab, String mercimek, String kunefe, String salgam) {
        this.yemekler=adanakebab;
        this.araSicak=mercimek;
        this.tatlilar=kunefe;
        this.icecekler=salgam;
    }

    public mutfak() {

    }

    @Override
    public String toString() {
        return "mutfak{" +
                "\nyemekler='" + yemekler + '\'' +
                ", \naraSicak='" + araSicak + '\'' +
                ", \ntatlilar='" + tatlilar + '\'' +
                ", \nicecekler='" + icecekler + '\'' +
                '}';
    }
}
