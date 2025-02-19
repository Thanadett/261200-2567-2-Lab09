public class Eagle implements Flyable {
    @Override
    public void move() {
        System.out.println("Eagle Moving...");
    }

    @Override
    public void fly() {
        System.out.println("Eagle Flying...");
    }
}