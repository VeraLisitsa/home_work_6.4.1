public class CourierDelivery implements Delivery {  //"SOLID-S"

    @Override
    public String msg() {
        return "Ожидайте доставку завтра с 9:00 до 20:00";
    }
}
