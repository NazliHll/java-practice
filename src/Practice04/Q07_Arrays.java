package Practice04;

public class Q07_Arrays {
    public static void main(String[] args) {
        /*
         * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini
         * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1}; int
         * istenenToplam=9;
         */

        int arr[]={5,7,-6,4,2,15,3,8,1};
        int istenenToplam=9;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]+arr[j]==9){
                    System.out.println(arr[i]+" ve "+arr[j]+"toplam: "+istenenToplam);
                }
            }
        }

          /*
                i=i+1 :  5 ve 4 toplam : 9
                         7 ve 2 toplam : 9
                        -6 ve 15 toplam : 9
                         8 ve 1 toplam : 9
                 */
    }
}
