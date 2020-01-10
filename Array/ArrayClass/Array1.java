package Array.ArrayClass;

/**
 * Array1
 */
public class Array1 {

    public static void main(String[] args) {

        int[] jd;
        int[] mj = { 1, 2, 3, 4, 5, 6 };

        // general way of looping over array in java
        for (int i = 0; i < mj.length; i++) {
            System.out.println(mj[i]);
        }
        System.out.println("===================>");
        // enhance looping
        for (int item : mj) {
            mj[3] = 6;
            // System.out.println(java.util.Arrays.toString(mj));
            System.out.println(item);
        }

        System.out.println(java.util.Arrays.toString(mj));

        // System.out.println(java.util.Arrays.toString(mj));

        System.out.println("hello array");
    }
}