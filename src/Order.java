public class Order {  //"SOLID-S"
    private static final String INDEX = "A122"; // "Магические числа"
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
