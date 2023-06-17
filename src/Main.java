import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ListOfGoods list = ListOfGoods.getInstance()
                .addGoods(new Product(10, "Хлеб", 30.5, "Каравай"))
                .addGoods(new Product(20, "Подсолнечное масло", 80.4, "Слобода"))
                .addGoods(new Product(30, "Сливки", 100.23, "Весёлый молочник"))
                .addGoods(new Product(31, "Молоко", 75.2, "Простоквашино"))
                .addGoods(new Alcohol(90, "Вино", 599.0, "Инкерман"))
                .addGoods(new Alcohol(91, "Пиво", 105.5, "Балтика"));

        System.out.println("\nСоберите свой заказ");

        do {
            list.printGoods();
            fillBasket();
            getOrder();
            chooseDelivery();

            System.out.println("Хотите сделать еще один заказ? Y/N");
            String oneMoreOrder = scanner.next();
            if (oneMoreOrder.equals("N")) {
                break;
            }
        } while (true);
    }

    public static void fillBasket() {
        ShoppingBasket basket = new ShoppingBasket();
        Goods bonus = new BonusProduct(00, "Скрепыш", "Фабрика скрепышей");
        while (true) {
            System.out.println("Введите код товара:");
            int ProductId = scanner.nextInt();
            System.out.println("Введите количество товара:");
            int amountOfProducts = scanner.nextInt();
            basket.addProduct(ListOfGoods.getGoods(ProductId), amountOfProducts); //"DRY
            // повторяющаяся операция добавления продукта в корзину вынесена в отдельный метод add Product
            System.out.println("Продолжить наполнять корзину? Y/N");
            String input = scanner.next();
            if (input.equals("N")) {
                break;
            }
        }

        double priceBasket = basket.priceOfBasket();
        if (priceBasket >= 300) {
            basket.addProduct(bonus, 1); //"DRY"
        }

        System.out.println("Вы заказали:");
        basket.printBasket();
        System.out.printf("Итоговая стоимость: %.2f руб. \n", priceBasket);
    }

    public static void getOrder() {
        Order order = new Order();
        System.out.println("Ваш номер заказа: " + order.getOrderId());
    }

    public static void chooseDelivery() {
        System.out.println("Выберите способ доставки:");
        System.out.println("C - курьер");
        System.out.println("S - самовывоз");
        String deliveryOption = scanner.next();
        Delivery delivery;
        // "SOLID-D"
        //не надо беспокоиться о деталях реализации доставки, необходимо только с помощью конструктора
        //указать тип доставки, остальную реализацию менять не нужно

        if (deliveryOption.equals("C")) {
            delivery = new CourierDelivery();
        } else {
            delivery = new SelfServiceDelivery();
        }
        System.out.println(delivery.msg());
    }
}