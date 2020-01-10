package Array;

/**
 * 2Denhanceloop
 */
public class TwoDenhanceloop {

    public static void main(String[] args) {
        int[][] newArr = { { 1, 2, 3, 4 }, { 0, 9, 8, 7 } };

        for (int i[] : newArr) {
            for (int j : i) {
                System.out.println(j);
            }
        }
    }
}