public class Main {
    public static void main(String[] args) {
        // OCP
        System.out.println("=== OCP ===");
        Shape rectangle = new Rectangle(2, 5);
        Shape circle = new Circle(4);
        Shape ellipse = new Ellipse(6, 4);

        System.out.println("Rectangle Area: " + String.format("%.2f", rectangle.calculateArea()));
        System.out.println("Circle Area: " + String.format("%.2f", circle.calculateArea()));
        System.out.println("Ellipse Area: " + String.format("%.2f", ellipse.calculateArea()));

        // LSP
        System.out.println("\n=== LSP ===");
        Moveable penguin = new Penguin();
        Moveable ostrich = new Ostrich();
        Flyable sparrow = new Sparrow();
        Flyable eagle = new Eagle();

        penguin.move();
        ostrich.move();
        sparrow.move();
        sparrow.fly();
        eagle.move();
        eagle.fly();

        // DIP
        System.out.println("\n=== DIP ===");
        OrderProcessor emailOrderProcessor = new OrderProcessor(new EmailNotifier());
        emailOrderProcessor.processOrder("Email");

        OrderProcessor smsOrderProcessor = new OrderProcessor(new SMSNotifier());
        smsOrderProcessor.processOrder("SMS");
    }
}