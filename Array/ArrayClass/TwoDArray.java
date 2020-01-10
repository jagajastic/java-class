package Array.ArrayClass;

/**
 * TwoDArray
 */
public class TwoDArray {

    public static void main(String[] args) {

        // two dimensional array

        int[][] arrNew = { { 1, 2, 3, 4, 5, 6, 7, 8, 9 } };

        int[][] arrOfNum = { { 1, 2, 3, 4, 5, 6, 7, 8, 9 } };

        System.out.println("============>");
        for (int i = 0; i < arrNew.length; i++) {
            for (int j = 0; j < arrNew[i].length; j++) {
                System.out.println(arrNew[i][j]);
            }
            System.out.println("============>");
        }

        // enhance for loop
        for (int[] item : arrNew) {
            for (int item2 : item) {
                System.out.println(item2);
            }
        }

    }

}