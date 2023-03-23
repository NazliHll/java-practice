package day02_recap;

public class Q06_NestedTurnery {
    public static void main(String[] args) {
           /*
        Final notu tanimlayin, Nested Ternary ile cozunuz
        'A'  ->  "Gayet Basarili"
        'B'  ->  "Basarili"
        'C'  ->   "Ha gayret"
        bu notlar disindakilere de Digerleri.. yazdiriniz
         */
        char finalNotu='C';
        String result =finalNotu=='A'?"Gayet Basarili" :finalNotu=='B'? "Basarili" :finalNotu=='C'? "Ha gayret" :"diğerleri";
        System.out.println("result = " + result);





    }
}

