package Practice03;

public class Q03_ForLoop {
    public static void main(String[] args) {
        /*
	 	Get the number of rows and columns from user.
	 	Create a rectangle.
	 	rows = 3 and column = 5 ==> * * * * *
	 	                            * * * * *
	 	                            * * * * *
	 */
        int yukseklik = 4;
        int boy = 10;

        for (int i = 1; i <= yukseklik; i++) {
            for (int j = 1; j <= boy; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
