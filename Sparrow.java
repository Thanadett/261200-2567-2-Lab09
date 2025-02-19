public class Sparrow implements Flyable {
    @Override
    public void move() {
        System.out.println("Sparrow Moving...");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow Flying...");
    }
}