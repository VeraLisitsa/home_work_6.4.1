public class SelfServiceDelivery implements Delivery {   //"SOLID-S"

    @Override
    public String msg() {
        return "Вы можете получить заказ в любое время в нашем офисе";
    }
}
