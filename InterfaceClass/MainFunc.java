/**
 * MainFunc
 */

public class MainFunc implements Car {

    String howYouShouldMove = "qwertyuiop";

    @Override
    public int move() {
        System.out.println("moving...");
        return 123;

    }

    @Override
    public String moveCar(String move) {
        System.out.println("qwertyui");
        return null;
    }

    @Override
    public String walk() {
        System.out.println("walking...");
        return null;
    }

    @Override
    public String jump() {
        System.out.println("Person is jumping...");
        return null;
    }

    @Override
    public int money() {
        System.out.println(123);
        return 123;
    }

    @Override
    public int k() {
        System.out.println("printing dollars...");
        return 123;
    }

}