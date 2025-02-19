public class OrderProcessor {
    private final NotificationService notificationService;

    public OrderProcessor(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void processOrder(String order) {
        System.out.println("Order processed: " + order);
        notificationService.notify("Confirmation sent.");
    }
}