/**
 * Ebi
 */
public class Ebi implements Person {
    @Override
    public int move() {
        System.out.println("before moving make sure to check your brake, then move...");
        return 1;

    }

    @Override
    public String walk() {
        System.out.println("check your legs to see if you can stand , then try walking...");
        return null;
    }

    @Override
    public String jump() {
        System.out.println("Person is jumping...");
        return null;
    }

}