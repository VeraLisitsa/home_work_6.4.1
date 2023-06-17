public class Order {
    private static final String INDEX = "A122";
    // "Магические числа"
    // значение параметра не используется напрямую, для него заведена специальная константа INDEX
    private String orderId;

    private static int countId;

    public Order() {
        orderId = INDEX + "-" + (countId + 1);
        countId++;
    }

    public String getOrderId() {
        return orderId;
    }
}
