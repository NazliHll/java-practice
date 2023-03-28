package Practice02;

public class Q01_MethodCreation {
    public static void main(String[] args) {
        /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */
        birKereYazdir("nazlı yasar");
    }

    public static void birKereYazdir(String str) {
        String output="";//string default degeri hiclik oldugu icin isleme etki etmesin diye bu sekilde atama yaptık

        for (int i = 0; i <str.length() ; i++) {  //int i = 0; i <=str.length()-1 ; i++
            if(!output.contains(str.substring(i,i+1))){ //tekrarsiz karakterleri dondurecegimiz icin sonucumuz str den aldigimiz herhangi bir karakteri icermesin
                output+=str.substring(i,i+1);

            }

        }
        System.out.println(output);





    }
}
